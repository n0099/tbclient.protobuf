package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class CommonThread extends Message {
    public static final String DEFAULT_MODULE_NAME = "";
    public static final List<GoodThread> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GoodThread> thread_list;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CommonThread> {
        public String module_name;
        public List<GoodThread> thread_list;

        public Builder() {
        }

        public Builder(CommonThread commonThread) {
            super(commonThread);
            if (commonThread == null) {
                return;
            }
            this.module_name = commonThread.module_name;
            this.thread_list = Message.copyOf(commonThread.thread_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonThread build(boolean z) {
            return new CommonThread(this, z);
        }
    }

    public CommonThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            List<GoodThread> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.module_name = builder.module_name;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
    }
}
