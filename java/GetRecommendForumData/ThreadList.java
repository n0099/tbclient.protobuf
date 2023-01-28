package tbclient.GetRecommendForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadList extends Message {
  public static final String DEFAULT_PIC = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ThreadList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this.pic = ((Builder)str).pic;
    } 
  }
  
  public ThreadList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadList> {
    public String pic;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ThreadList param1ThreadList) {
      super(param1ThreadList);
      if (param1ThreadList == null)
        return; 
      this.tid = param1ThreadList.tid;
      this.title = param1ThreadList.title;
      this.pic = param1ThreadList.pic;
    }
    
    public ThreadList build(boolean param1Boolean) {
      return new ThreadList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
