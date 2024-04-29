package com.app.taskhub.models;

import java.sql.Date;

public class Task {

    public Integer idTask;
    public String title;
    public String description;

    //Espaço para anotações ou detalhes adicionais sobre a tarefa.
    public String notes;
    public Date dueDate;

    // Uma classificação que indica a importância ou urgência da tarefa (por exemplo, alta, média, baixa).
    public Priority priority;

    //Uma categoria à qual a tarefa pertence (por exemplo, trabalho, pessoal, estudos)
    public Category category;

    //Marcadores para identificar e filtrar tarefas
    public Tag tag;
    public Reminder reminder;

    //Possibilidade de anexar arquivos, imagens ou links relacionados à tarefa.
    public Attachment attachment;



}
