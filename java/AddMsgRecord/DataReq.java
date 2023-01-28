package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<MsgRecord> DEFAULT_RECORDS = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<MsgRecord> records;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<MsgRecord> list;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      list = paramBuilder.records;
      if (list == null) {
        this.records = DEFAULT_RECORDS;
      } else {
        this.records = Message.immutableCopyOf(list);
      } 
    } else {
      this.common = ((Builder)list).common;
      this.records = Message.immutableCopyOf(((Builder)list).records);
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public List<MsgRecord> records;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.records = Message.copyOf(param1DataReq.records);
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
