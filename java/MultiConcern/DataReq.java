package tbclient.MultiConcern;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final List<Long> DEFAULT_ARR_FORUM_ID = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT64)
    public final List<Long> arr_forum_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1134common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1134common = builder.f1135common;
            if (builder.arr_forum_id == null) {
                this.arr_forum_id = DEFAULT_ARR_FORUM_ID;
                return;
            } else {
                this.arr_forum_id = immutableCopyOf(builder.arr_forum_id);
                return;
            }
        }
        this.f1134common = builder.f1135common;
        this.arr_forum_id = immutableCopyOf(builder.arr_forum_id);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Long> arr_forum_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1135common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1135common = dataReq.f1134common;
                this.arr_forum_id = DataReq.copyOf(dataReq.arr_forum_id);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
