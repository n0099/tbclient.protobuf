package tbclient.SmartAppList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final String DEFAULT_RN = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69634common;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rn;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69635common;
        public Long fid;
        public Integer pn;
        public String rn;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69635common = dataReq.f69634common;
            this.fid = dataReq.fid;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f69634common = builder.f69635common;
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            String str = builder.rn;
            if (str == null) {
                this.rn = "";
                return;
            } else {
                this.rn = str;
                return;
            }
        }
        this.f69634common = builder.f69635common;
        this.fid = builder.fid;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }
}
