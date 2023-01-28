package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class HeaderCard extends Message {
  public static final String DEFAULT_CARD_TITLE = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String card_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  public HeaderCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.card_title;
      if (str == null) {
        this.card_title = "";
      } else {
        this.card_title = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.card_title = ((Builder)list).card_title;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public HeaderCard(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HeaderCard> {
    public String card_title;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(HeaderCard param1HeaderCard) {
      super(param1HeaderCard);
      if (param1HeaderCard == null)
        return; 
      this.card_title = param1HeaderCard.card_title;
      this.thread_list = Message.copyOf(param1HeaderCard.thread_list);
    }
    
    public HeaderCard build(boolean param1Boolean) {
      return new HeaderCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
