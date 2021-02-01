package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_HOT_THREAD_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> hot_thread_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_thread_info == null) {
                this.hot_thread_info = DEFAULT_HOT_THREAD_INFO;
                return;
            } else {
                this.hot_thread_info = immutableCopyOf(builder.hot_thread_info);
                return;
            }
        }
        this.hot_thread_info = immutableCopyOf(builder.hot_thread_info);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> hot_thread_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.hot_thread_info = DataRes.copyOf(dataRes.hot_thread_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
