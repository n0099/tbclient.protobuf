package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TaskInfoItem extends Message {
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_SCORES = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scores;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TaskInfoItem> {
        public Integer is_finish;
        public Integer scores;

        public Builder() {
        }

        public Builder(TaskInfoItem taskInfoItem) {
            super(taskInfoItem);
            if (taskInfoItem == null) {
                return;
            }
            this.is_finish = taskInfoItem.is_finish;
            this.scores = taskInfoItem.scores;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TaskInfoItem build(boolean z) {
            return new TaskInfoItem(this, z);
        }
    }

    public TaskInfoItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            Integer num2 = builder.scores;
            if (num2 == null) {
                this.scores = DEFAULT_SCORES;
                return;
            } else {
                this.scores = num2;
                return;
            }
        }
        this.is_finish = builder.is_finish;
        this.scores = builder.scores;
    }
}
