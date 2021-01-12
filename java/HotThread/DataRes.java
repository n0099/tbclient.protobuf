package tbclient.HotThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<tinfo> DEFAULT_HOT_THREAD = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<tinfo> hot_thread;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_thread == null) {
                this.hot_thread = DEFAULT_HOT_THREAD;
                return;
            } else {
                this.hot_thread = immutableCopyOf(builder.hot_thread);
                return;
            }
        }
        this.hot_thread = immutableCopyOf(builder.hot_thread);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<tinfo> hot_thread;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.hot_thread = DataRes.copyOf(dataRes.hot_thread);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
