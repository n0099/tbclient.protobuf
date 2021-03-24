package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Group extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer group_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer hide_recommend_group;
    public static final Integer DEFAULT_HIDE_RECOMMEND_GROUP = 0;
    public static final Integer DEFAULT_GROUP_COUNT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Group> {
        public Integer group_count;
        public Integer hide_recommend_group;

        public Builder() {
        }

        public Builder(Group group) {
            super(group);
            if (group == null) {
                return;
            }
            this.hide_recommend_group = group.hide_recommend_group;
            this.group_count = group.group_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Group build(boolean z) {
            return new Group(this, z);
        }
    }

    public Group(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.hide_recommend_group;
            if (num == null) {
                this.hide_recommend_group = DEFAULT_HIDE_RECOMMEND_GROUP;
            } else {
                this.hide_recommend_group = num;
            }
            Integer num2 = builder.group_count;
            if (num2 == null) {
                this.group_count = DEFAULT_GROUP_COUNT;
                return;
            } else {
                this.group_count = num2;
                return;
            }
        }
        this.hide_recommend_group = builder.hide_recommend_group;
        this.group_count = builder.group_count;
    }
}
