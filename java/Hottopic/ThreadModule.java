package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThreadModule extends Message {
    @ProtoField(tag = 1)
    public final CommonThread thread_module_1;
    @ProtoField(tag = 2)
    public final CommonThread thread_module_2;
    @ProtoField(tag = 3)
    public final CommonThread thread_module_3;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadModule> {
        public CommonThread thread_module_1;
        public CommonThread thread_module_2;
        public CommonThread thread_module_3;

        public Builder() {
        }

        public Builder(ThreadModule threadModule) {
            super(threadModule);
            if (threadModule == null) {
                return;
            }
            this.thread_module_1 = threadModule.thread_module_1;
            this.thread_module_2 = threadModule.thread_module_2;
            this.thread_module_3 = threadModule.thread_module_3;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadModule build(boolean z) {
            return new ThreadModule(this, z);
        }
    }

    public ThreadModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_module_1 = builder.thread_module_1;
            this.thread_module_2 = builder.thread_module_2;
            this.thread_module_3 = builder.thread_module_3;
            return;
        }
        this.thread_module_1 = builder.thread_module_1;
        this.thread_module_2 = builder.thread_module_2;
        this.thread_module_3 = builder.thread_module_3;
    }
}
