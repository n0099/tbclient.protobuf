package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_CALL_FROM = 0L;
    public static final Long DEFAULT_FID = 0L;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long call_from;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1515common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long fid;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Long call_from;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1516common;
        public Long fid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1516common = dataReq.f1515common;
            this.call_from = dataReq.call_from;
            this.fid = dataReq.fid;
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
            this.f1515common = builder.f1516common;
            Long l = builder.call_from;
            if (l == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = l;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = l2;
                return;
            }
        }
        this.f1515common = builder.f1516common;
        this.call_from = builder.call_from;
        this.fid = builder.fid;
    }
}
