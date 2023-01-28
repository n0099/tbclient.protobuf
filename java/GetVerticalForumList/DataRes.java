package tbclient.GetVerticalForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ClassForumInfo;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<ClassForumInfo> DEFAULT_CLASS_FORUMINFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ClassForumInfo> class_foruminfo;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ClassForumInfo> list = paramBuilder.class_foruminfo;
      if (list == null) {
        this.class_foruminfo = DEFAULT_CLASS_FORUMINFO;
      } else {
        this.class_foruminfo = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.class_foruminfo = Message.immutableCopyOf(paramBuilder.class_foruminfo);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ClassForumInfo> class_foruminfo;
    
    public Page page;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.class_foruminfo = Message.copyOf(param1DataRes.class_foruminfo);
      this.page = param1DataRes.page;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
