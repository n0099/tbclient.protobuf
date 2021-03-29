package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_HOT_THREAD_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> hot_thread_info;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> hot_thread_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.hot_thread_info = Message.copyOf(dataRes.hot_thread_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.hot_thread_info;
            if (list == null) {
                this.hot_thread_info = DEFAULT_HOT_THREAD_INFO;
                return;
            } else {
                this.hot_thread_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.hot_thread_info = Message.immutableCopyOf(builder.hot_thread_info);
    }
}
