package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<ImgInfo> DEFAULT_IMG_LIST;
  
  public static final List<PointTaskInfo> DEFAULT_TASK_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ImgInfo> img_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PointTaskInfo> task_list;
  
  @ProtoField(tag = 3)
  public final UserPointInfo user_point_info;
  
  static {
    DEFAULT_IMG_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<PointTaskInfo> list1 = paramBuilder.task_list;
      if (list1 == null) {
        this.task_list = DEFAULT_TASK_LIST;
      } else {
        this.task_list = Message.immutableCopyOf(list1);
      } 
      List<ImgInfo> list = paramBuilder.img_list;
      if (list == null) {
        this.img_list = DEFAULT_IMG_LIST;
      } else {
        this.img_list = Message.immutableCopyOf(list);
      } 
      this.user_point_info = paramBuilder.user_point_info;
    } else {
      this.task_list = Message.immutableCopyOf(paramBuilder.task_list);
      this.img_list = Message.immutableCopyOf(paramBuilder.img_list);
      this.user_point_info = paramBuilder.user_point_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ImgInfo> img_list;
    
    public List<PointTaskInfo> task_list;
    
    public UserPointInfo user_point_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.task_list = Message.copyOf(param1DataRes.task_list);
      this.img_list = Message.copyOf(param1DataRes.img_list);
      this.user_point_info = param1DataRes.user_point_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
