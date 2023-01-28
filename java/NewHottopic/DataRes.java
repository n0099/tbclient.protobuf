package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final PkModule pk_module;
  
  @ProtoField(tag = 9)
  public final RelateThread relate_thread;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<SpecialTopic> special_topic;
  
  @ProtoField(tag = 4)
  public final TimeLine time_line;
  
  @ProtoField(tag = 1)
  public final TopicDetail topic_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.topic_info = paramBuilder.topic_info;
      this.pk_module = paramBuilder.pk_module;
      this.time_line = paramBuilder.time_line;
      List<SpecialTopic> list = paramBuilder.special_topic;
      if (list == null) {
        this.special_topic = DEFAULT_SPECIAL_TOPIC;
      } else {
        this.special_topic = Message.immutableCopyOf(list);
      } 
      this.relate_thread = paramBuilder.relate_thread;
    } else {
      this.topic_info = paramBuilder.topic_info;
      this.pk_module = paramBuilder.pk_module;
      this.time_line = paramBuilder.time_line;
      this.special_topic = Message.immutableCopyOf(paramBuilder.special_topic);
      this.relate_thread = paramBuilder.relate_thread;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public PkModule pk_module;
    
    public RelateThread relate_thread;
    
    public List<SpecialTopic> special_topic;
    
    public TimeLine time_line;
    
    public TopicDetail topic_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.topic_info = param1DataRes.topic_info;
      this.pk_module = param1DataRes.pk_module;
      this.time_line = param1DataRes.time_line;
      this.special_topic = Message.copyOf(param1DataRes.special_topic);
      this.relate_thread = param1DataRes.relate_thread;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
