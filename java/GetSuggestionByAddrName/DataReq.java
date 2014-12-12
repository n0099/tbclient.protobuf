package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ADDR_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String addr_name;
    @ProtoField(tag = 2)
    public final CommonReq common;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.addr_name == null) {
                this.addr_name = "";
            } else {
                this.addr_name = builder.addr_name;
            }
            this.common = builder.common;
            return;
        }
        this.addr_name = builder.addr_name;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public String addr_name;
        public CommonReq common;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.addr_name = dataReq.addr_name;
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
