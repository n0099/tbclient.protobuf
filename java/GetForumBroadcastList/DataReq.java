package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.INT64)
    public final List<Long> bcast_ids;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69294common;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer need_cnt;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer query_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer staff_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long staff_id64;
    public static final Integer DEFAULT_QUERY_TYPE = 0;
    public static final Integer DEFAULT_STAFF_ID = 0;
    public static final Integer DEFAULT_NEED_CNT = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final List<Long> DEFAULT_BCAST_IDS = Collections.emptyList();
    public static final Long DEFAULT_STAFF_ID64 = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Long> bcast_ids;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69295common;
        public Long forum_id;
        public Integer need_cnt;
        public Integer query_type;
        public Integer staff_id;
        public Long staff_id64;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69295common = dataReq.f69294common;
            this.query_type = dataReq.query_type;
            this.staff_id = dataReq.staff_id;
            this.need_cnt = dataReq.need_cnt;
            this.forum_id = dataReq.forum_id;
            this.bcast_ids = Message.copyOf(dataReq.bcast_ids);
            this.staff_id64 = dataReq.staff_id64;
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
            this.f69294common = builder.f69295common;
            Integer num = builder.query_type;
            if (num == null) {
                this.query_type = DEFAULT_QUERY_TYPE;
            } else {
                this.query_type = num;
            }
            Integer num2 = builder.staff_id;
            if (num2 == null) {
                this.staff_id = DEFAULT_STAFF_ID;
            } else {
                this.staff_id = num2;
            }
            Integer num3 = builder.need_cnt;
            if (num3 == null) {
                this.need_cnt = DEFAULT_NEED_CNT;
            } else {
                this.need_cnt = num3;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            List<Long> list = builder.bcast_ids;
            if (list == null) {
                this.bcast_ids = DEFAULT_BCAST_IDS;
            } else {
                this.bcast_ids = Message.immutableCopyOf(list);
            }
            Long l2 = builder.staff_id64;
            if (l2 == null) {
                this.staff_id64 = DEFAULT_STAFF_ID64;
                return;
            } else {
                this.staff_id64 = l2;
                return;
            }
        }
        this.f69294common = builder.f69295common;
        this.query_type = builder.query_type;
        this.staff_id = builder.staff_id;
        this.need_cnt = builder.need_cnt;
        this.forum_id = builder.forum_id;
        this.bcast_ids = Message.immutableCopyOf(builder.bcast_ids);
        this.staff_id64 = builder.staff_id64;
    }
}
