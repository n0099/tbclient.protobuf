package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdInfo;

public final class DataRes extends Message {
  public static final List<AdInfo> DEFAULT_AD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  public static final Long DEFAULT_OFFSET = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AdInfo> ad_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long offset;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List<AdInfo> list = paramBuilder.ad_list;
      if (list == null) {
        this.ad_list = DEFAULT_AD_LIST;
      } else {
        this.ad_list = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      long_ = paramBuilder.offset;
      if (long_ == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = long_;
      } 
    } else {
      this.ad_list = Message.immutableCopyOf(((Builder)long_).ad_list);
      this.has_more = ((Builder)long_).has_more;
      this.offset = ((Builder)long_).offset;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<AdInfo> ad_list;
    
    public Integer has_more;
    
    public Long offset;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.ad_list = Message.copyOf(param1DataRes.ad_list);
      this.has_more = param1DataRes.has_more;
      this.offset = param1DataRes.offset;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
