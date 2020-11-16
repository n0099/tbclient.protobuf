package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes21.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f5250common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f5250common = builder.f5251common;
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = builder.pn;
                return;
            }
        }
        this.f5250common = builder.f5251common;
        this.portrait = builder.portrait;
        this.pn = builder.pn;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f5251common;
        public Integer pn;
        public String portrait;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f5251common = dataReq.f5250common;
                this.portrait = dataReq.portrait;
                this.pn = dataReq.pn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
