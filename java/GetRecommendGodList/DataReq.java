package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1375common;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1376common;
        public Integer pn;
        public String portrait;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1376common = dataReq.f1375common;
            this.portrait = dataReq.portrait;
            this.pn = dataReq.pn;
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
            this.f1375common = builder.f1376common;
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num;
                return;
            }
        }
        this.f1375common = builder.f1376common;
        this.portrait = builder.portrait;
        this.pn = builder.pn;
    }
}
