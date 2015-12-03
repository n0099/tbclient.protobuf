package tbclient.GetUserForumStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> store_thread;
    public static final List<ThreadInfo> DEFAULT_STORE_THREAD = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.store_thread == null) {
                this.store_thread = DEFAULT_STORE_THREAD;
            } else {
                this.store_thread = immutableCopyOf(builder.store_thread);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.store_thread = immutableCopyOf(builder.store_thread);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public List<ThreadInfo> store_thread;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.store_thread = DataRes.copyOf(dataRes.store_thread);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
