package tbclient.GetChannelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_PS = 0;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long channel_id;
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer ps;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.channel_id == null) {
                this.channel_id = DEFAULT_CHANNEL_ID;
            } else {
                this.channel_id = builder.channel_id;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.ps == null) {
                this.ps = DEFAULT_PS;
                return;
            } else {
                this.ps = builder.ps;
                return;
            }
        }
        this.common = builder.common;
        this.channel_id = builder.channel_id;
        this.pn = builder.pn;
        this.ps = builder.ps;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long channel_id;
        public CommonReq common;
        public Integer pn;
        public Integer ps;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.channel_id = dataReq.channel_id;
                this.pn = dataReq.pn;
                this.ps = dataReq.ps;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
