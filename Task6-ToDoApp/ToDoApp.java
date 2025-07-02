import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

public class ToDoApp extends JFrame {

    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInputField;
    private JButton addButton;
    private JButton deleteButton;

    private static final String FILE_NAME = "tasks.txt";

    public ToDoApp() {
        setTitle("To-Do List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Top panel: input and buttons
        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));

        taskInputField = new JTextField(20);
        inputPanel.add(taskInputField, BorderLayout.CENTER);

        addButton = new JButton("Add Task");
        deleteButton = new JButton("Delete Selected");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        inputPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Task list
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Load tasks from file on startup
        loadTasksFromFile();

        // Add task button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInputField.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskInputField.setText("");
                    saveTasksToFile();
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this, "Please enter a task.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Delete task button
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                    saveTasksToFile();
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this, "Please select a task to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < taskListModel.size(); i++) {
                writer.write(taskListModel.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving tasks: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String task;
                while ((task = reader.readLine()) != null) {
                    taskListModel.addElement(task);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error loading tasks: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ToDoApp().setVisible(true);
        });
    }
}
