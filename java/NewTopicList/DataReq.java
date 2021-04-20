package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69560common;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69561common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69561common = dataReq.f69560common;
            this.call_from = dataReq.call_from;
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
            this.f69560common = builder.f69561common;
            String str = builder.call_from;
            if (str == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = str;
                return;
            }
        }
        this.f69560common = builder.f69561common;
        this.call_from = builder.call_from;
    }
}
