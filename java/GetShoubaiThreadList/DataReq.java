package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1240common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long cursor;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer page_size;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_PAGE_SIZE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1241common;
        public Long cursor;
        public Integer page_size;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1241common = dataReq.f1240common;
            this.uid = dataReq.uid;
            this.cursor = dataReq.cursor;
            this.page_size = dataReq.page_size;
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
            this.f1240common = builder.f1241common;
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Long l2 = builder.cursor;
            if (l2 == null) {
                this.cursor = DEFAULT_CURSOR;
            } else {
                this.cursor = l2;
            }
            Integer num = builder.page_size;
            if (num == null) {
                this.page_size = DEFAULT_PAGE_SIZE;
                return;
            } else {
                this.page_size = num;
                return;
            }
        }
        this.f1240common = builder.f1241common;
        this.uid = builder.uid;
        this.cursor = builder.cursor;
        this.page_size = builder.page_size;
    }
}
