package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class Group extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer group_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer hide_recommend_group;
    public static final Integer DEFAULT_HIDE_RECOMMEND_GROUP = 0;
    public static final Integer DEFAULT_GROUP_COUNT = 0;

    private Group(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hide_recommend_group == null) {
                this.hide_recommend_group = DEFAULT_HIDE_RECOMMEND_GROUP;
            } else {
                this.hide_recommend_group = builder.hide_recommend_group;
            }
            if (builder.group_count == null) {
                this.group_count = DEFAULT_GROUP_COUNT;
                return;
            } else {
                this.group_count = builder.group_count;
                return;
            }
        }
        this.hide_recommend_group = builder.hide_recommend_group;
        this.group_count = builder.group_count;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Group> {
        public Integer group_count;
        public Integer hide_recommend_group;

        public Builder() {
        }

        public Builder(Group group) {
            super(group);
            if (group != null) {
                this.hide_recommend_group = group.hide_recommend_group;
                this.group_count = group.group_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Group build(boolean z) {
            return new Group(this, z);
        }
    }
}
