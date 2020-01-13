package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class ThreadModule extends Message {
    public static final String DEFAULT_MODULE_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long module_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long show_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadInfo> thread_info;
    public static final Long DEFAULT_MODULE_ID = 0L;
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO = Collections.emptyList();
    public static final Long DEFAULT_SHOW_NUM = 0L;

    private ThreadModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.module_id == null) {
                this.module_id = DEFAULT_MODULE_ID;
            } else {
                this.module_id = builder.module_id;
            }
            if (builder.module_name == null) {
                this.module_name = "";
            } else {
                this.module_name = builder.module_name;
            }
            if (builder.thread_info == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = immutableCopyOf(builder.thread_info);
            }
            if (builder.show_num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
                return;
            } else {
                this.show_num = builder.show_num;
                return;
            }
        }
        this.module_id = builder.module_id;
        this.module_name = builder.module_name;
        this.thread_info = immutableCopyOf(builder.thread_info);
        this.show_num = builder.show_num;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThreadModule> {
        public Long module_id;
        public String module_name;
        public Long show_num;
        public List<ThreadInfo> thread_info;

        public Builder() {
        }

        public Builder(ThreadModule threadModule) {
            super(threadModule);
            if (threadModule != null) {
                this.module_id = threadModule.module_id;
                this.module_name = threadModule.module_name;
                this.thread_info = ThreadModule.copyOf(threadModule.thread_info);
                this.show_num = threadModule.show_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadModule build(boolean z) {
            return new ThreadModule(this, z);
        }
    }
}
