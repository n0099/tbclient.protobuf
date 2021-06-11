package tbclient.MultiConcern;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final List<Long> DEFAULT_ARR_FORUM_ID = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT64)
    public final List<Long> arr_forum_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72786common;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Long> arr_forum_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72787common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f72787common = dataReq.f72786common;
            this.arr_forum_id = Message.copyOf(dataReq.arr_forum_id);
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
            this.f72786common = builder.f72787common;
            List<Long> list = builder.arr_forum_id;
            if (list == null) {
                this.arr_forum_id = DEFAULT_ARR_FORUM_ID;
                return;
            } else {
                this.arr_forum_id = Message.immutableCopyOf(list);
                return;
            }
        }
        this.f72786common = builder.f72787common;
        this.arr_forum_id = Message.immutableCopyOf(builder.arr_forum_id);
    }
}
