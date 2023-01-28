package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ManageInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<ManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
  
  public static final List<ManageInfo> DEFAULT_MANAGE_RECOMM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ManageInfo> manage_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ManageInfo> manage_recomm_list;
  
  static {
    DEFAULT_HAS_MORE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ManageInfo> list = paramBuilder.manage_list;
      if (list == null) {
        this.manage_list = DEFAULT_MANAGE_LIST;
      } else {
        this.manage_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.manage_recomm_list;
      if (list == null) {
        this.manage_recomm_list = DEFAULT_MANAGE_RECOMM_LIST;
      } else {
        this.manage_recomm_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.manage_list = Message.immutableCopyOf(((Builder)integer).manage_list);
      this.manage_recomm_list = Message.immutableCopyOf(((Builder)integer).manage_recomm_list);
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer has_more;
    
    public List<ManageInfo> manage_list;
    
    public List<ManageInfo> manage_recomm_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.manage_list = Message.copyOf(param1DataRes.manage_list);
      this.manage_recomm_list = Message.copyOf(param1DataRes.manage_recomm_list);
      this.has_more = param1DataRes.has_more;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
