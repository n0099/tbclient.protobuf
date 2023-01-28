package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotOfficialThread extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final Integer DEFAULT_ICON_TYPE;
  
  public static final String DEFAULT_THREAD_PIC = "";
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_ICON_TYPE = Integer.valueOf(0);
  }
  
  public HotOfficialThread(Builder paramBuilder, boolean paramBoolean) {
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
      str1 = paramBuilder._abstract;
      if (str1 == null) {
        this._abstract = "";
      } else {
        this._abstract = str1;
      } 
      Integer integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
      str = paramBuilder.thread_pic;
      if (str == null) {
        this.thread_pic = "";
      } else {
        this.thread_pic = str;
      } 
    } else {
      this.tid = ((Builder)str).tid;
      this.title = ((Builder)str).title;
      this._abstract = ((Builder)str)._abstract;
      this.icon_type = ((Builder)str).icon_type;
      this.thread_pic = ((Builder)str).thread_pic;
    } 
  }
  
  public HotOfficialThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotOfficialThread> {
    public String _abstract;
    
    public Integer icon_type;
    
    public String thread_pic;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(HotOfficialThread param1HotOfficialThread) {
      super(param1HotOfficialThread);
      if (param1HotOfficialThread == null)
        return; 
      this.tid = param1HotOfficialThread.tid;
      this.title = param1HotOfficialThread.title;
      this._abstract = param1HotOfficialThread._abstract;
      this.icon_type = param1HotOfficialThread.icon_type;
      this.thread_pic = param1HotOfficialThread.thread_pic;
    }
    
    public HotOfficialThread build(boolean param1Boolean) {
      return new HotOfficialThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
