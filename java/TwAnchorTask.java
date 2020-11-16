package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class TwAnchorTask extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    public static final List<TwAnchorTaskItem> DEFAULT_TASK_LIST = Collections.emptyList();
    public static final String DEFAULT_TASK_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TwAnchorTaskItem> task_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_name;

    private TwAnchorTask(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.describe == null) {
                this.describe = "";
            } else {
                this.describe = builder.describe;
            }
            if (builder.task_list == null) {
                this.task_list = DEFAULT_TASK_LIST;
            } else {
                this.task_list = immutableCopyOf(builder.task_list);
            }
            if (builder.task_name == null) {
                this.task_name = "";
                return;
            } else {
                this.task_name = builder.task_name;
                return;
            }
        }
        this.describe = builder.describe;
        this.task_list = immutableCopyOf(builder.task_list);
        this.task_name = builder.task_name;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TwAnchorTask> {
        public String describe;
        public List<TwAnchorTaskItem> task_list;
        public String task_name;

        public Builder() {
        }

        public Builder(TwAnchorTask twAnchorTask) {
            super(twAnchorTask);
            if (twAnchorTask != null) {
                this.describe = twAnchorTask.describe;
                this.task_list = TwAnchorTask.copyOf(twAnchorTask.task_list);
                this.task_name = twAnchorTask.task_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTask build(boolean z) {
            return new TwAnchorTask(this, z);
        }
    }
}
