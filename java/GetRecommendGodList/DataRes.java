package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;

public final class DataRes extends Message {
  public static final Integer DEFAULT_CURRENT_PAGE;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<User> DEFAULT_RECOM_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer current_page;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> recom_user_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CURRENT_PAGE = integer;
    DEFAULT_HAS_MORE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<User> list = paramBuilder.recom_user_list;
      if (list == null) {
        this.recom_user_list = DEFAULT_RECOM_USER_LIST;
      } else {
        this.recom_user_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.current_page;
      if (integer1 == null) {
        this.current_page = DEFAULT_CURRENT_PAGE;
      } else {
        this.current_page = integer1;
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.recom_user_list = Message.immutableCopyOf(((Builder)integer).recom_user_list);
      this.current_page = ((Builder)integer).current_page;
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer current_page;
    
    public Integer has_more;
    
    public List<User> recom_user_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recom_user_list = Message.copyOf(param1DataRes.recom_user_list);
      this.current_page = param1DataRes.current_page;
      this.has_more = param1DataRes.has_more;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
