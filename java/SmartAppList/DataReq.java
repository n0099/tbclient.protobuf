package tbclient.SmartAppList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes6.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final String DEFAULT_RN = "";
    @ProtoField(tag = 1)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rn;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.fid == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = builder.fid;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = "";
                return;
            } else {
                this.rn = builder.rn;
                return;
            }
        }
        this.common = builder.common;
        this.fid = builder.fid;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long fid;
        public Integer pn;
        public String rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.fid = dataReq.fid;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}