package tbclient.MultiConcern;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final List<Long> DEFAULT_ARR_FORUM_ID = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT64)
    public final List<Long> arr_forum_id;
    @ProtoField(tag = 1)
    public final CommonReq common;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.common = builder.common;
            if (builder.arr_forum_id == null) {
                this.arr_forum_id = DEFAULT_ARR_FORUM_ID;
                return;
            } else {
                this.arr_forum_id = immutableCopyOf(builder.arr_forum_id);
                return;
            }
        }
        this.common = builder.common;
        this.arr_forum_id = immutableCopyOf(builder.arr_forum_id);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Long> arr_forum_id;
        public CommonReq common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.common = dataReq.common;
                this.arr_forum_id = DataReq.copyOf(dataReq.arr_forum_id);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
