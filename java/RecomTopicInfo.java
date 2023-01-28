package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecomTopicInfo extends Message {
  public static final String DEFAULT_RECOM_TITLE = "";
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recom_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecomTopicList> topic_list;
  
  public RecomTopicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecomTopicList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.recom_title;
      if (str == null) {
        this.recom_title = "";
      } else {
        this.recom_title = str;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.recom_title = ((Builder)list).recom_title;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public RecomTopicInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomTopicInfo> {
    public String recom_title;
    
    public List<RecomTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(RecomTopicInfo param1RecomTopicInfo) {
      super(param1RecomTopicInfo);
      if (param1RecomTopicInfo == null)
        return; 
      this.recom_title = param1RecomTopicInfo.recom_title;
      this.topic_list = Message.copyOf(param1RecomTopicInfo.topic_list);
    }
    
    public RecomTopicInfo build(boolean param1Boolean) {
      return new RecomTopicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
