package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<Integer> DEFAULT_ARR_TAG_ID = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
  public final List<Integer> arr_tag_id;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      list = paramBuilder.arr_tag_id;
      if (list == null) {
        this.arr_tag_id = DEFAULT_ARR_TAG_ID;
      } else {
        this.arr_tag_id = Message.immutableCopyOf(list);
      } 
    } else {
      this.common = ((Builder)list).common;
      this.arr_tag_id = Message.immutableCopyOf(((Builder)list).arr_tag_id);
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public List<Integer> arr_tag_id;
    
    public CommonReq common;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.arr_tag_id = Message.copyOf(param1DataReq.arr_tag_id);
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
