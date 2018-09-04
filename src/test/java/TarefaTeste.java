
import com.abcontrol.Dao.TarefaDao;
import com.abcontrol.Entity.Tarefa;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TarefaTeste{

    @Mock
    TarefaDao tarefaDao;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        tarefaDao = new TarefaDao();
    }

    @Test
    public void testargetTarefaById(){
        when(tarefaDao.getTarefaById(0)).thenReturn(new Tarefa());
        Tarefa tarefa = tarefaDao.getTarefaById(0);
        Assert.assertEquals(0, tarefa.getId());
        Assert.assertEquals("Gerar relatório projetos", tarefa.getNome());
        Assert.assertEquals("Gerar relatório de todos os projetos em execução hoje", tarefa.getDescricao());
        Mockito.verify(tarefaDao, Mockito.atLeastOnce()).getTarefaById(0);
    }

}