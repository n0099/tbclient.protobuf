package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1289common;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer sort_type;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Integer DEFAULT_CALL_FROM = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1290common;
        public Integer sort_type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1290common = dataReq.f1289common;
            this.sort_type = dataReq.sort_type;
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
            this.f1289common = builder.f1290common;
            Integer num = builder.sort_type;
            if (num == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num;
            }
            Integer num2 = builder.call_from;
            if (num2 == null) {
                this.call_from = DEFAULT_CALL_FROM;
                return;
            } else {
                this.call_from = num2;
                return;
            }
        }
        this.f1289common = builder.f1290common;
        this.sort_type = builder.sort_type;
        this.call_from = builder.call_from;
    }
}
