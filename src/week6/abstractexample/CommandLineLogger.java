package week6.abstractexample;

public class CommandLineLogger extends AbstractLogger {

    // @Override-ei ole pakollinen ylikirjoitettaessa kantaluokan metodia, mutta sen käyttäminen
    // helpottaa luettavuutta ja varmistaa että ohjelmisto ei kirjoitusvirheen vuoksi määrittele
    // uutta metodia, vaan antaa kääntäjävirheen virheellisesti ylikirjoitetusta metodista
    @Override
    public void logString(String logString) {
        System.out.println(this.formatLogString(logString));
    }
}
