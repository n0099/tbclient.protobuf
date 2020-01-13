package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class EverydayThread extends Message {
    public static final List<FineThreadInfo> DEFAULT_FINE_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_TIME = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineThreadInfo> fine_thread_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer show_time;

    private EverydayThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.fine_thread_list == null) {
                this.fine_thread_list = DEFAULT_FINE_THREAD_LIST;
            } else {
                this.fine_thread_list = immutableCopyOf(builder.fine_thread_list);
            }
            if (builder.show_time == null) {
                this.show_time = DEFAULT_SHOW_TIME;
                return;
            } else {
                this.show_time = builder.show_time;
                return;
            }
        }
        this.fine_thread_list = immutableCopyOf(builder.fine_thread_list);
        this.show_time = builder.show_time;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<EverydayThread> {
        public List<FineThreadInfo> fine_thread_list;
        public Integer show_time;

        public Builder() {
        }

        public Builder(EverydayThread everydayThread) {
            super(everydayThread);
            if (everydayThread != null) {
                this.fine_thread_list = EverydayThread.copyOf(everydayThread.fine_thread_list);
                this.show_time = everydayThread.show_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EverydayThread build(boolean z) {
            return new EverydayThread(this, z);
        }
    }
}
