package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TimeLine extends Message {
  public static final List<TimeLineInfo> DEFAULT_TIMELINE_INFO = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<TimeLineInfo> timeline_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TimeLine(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<TimeLineInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.timeline_info;
      if (list == null) {
        this.timeline_info = DEFAULT_TIMELINE_INFO;
      } else {
        this.timeline_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.timeline_info = Message.immutableCopyOf(((Builder)list).timeline_info);
    } 
  }
  
  public TimeLine(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TimeLine> {
    public List<TimeLineInfo> timeline_info;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TimeLine param1TimeLine) {
      super(param1TimeLine);
      if (param1TimeLine == null)
        return; 
      this.title = param1TimeLine.title;
      this.timeline_info = Message.copyOf(param1TimeLine.timeline_info);
    }
    
    public TimeLine build(boolean param1Boolean) {
      return new TimeLine(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
