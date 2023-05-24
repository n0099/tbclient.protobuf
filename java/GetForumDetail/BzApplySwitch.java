package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BzApplySwitch extends Message {
    public static final Integer DEFAULT_APPLY_SWITCH = 0;
    public static final String DEFAULT_ASSIST_LINK = "";
    public static final String DEFAULT_MANAGER_LINK = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer apply_switch;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String assist_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String manager_link;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BzApplySwitch> {
        public Integer apply_switch;
        public String assist_link;
        public String manager_link;

        public Builder() {
        }

        public Builder(BzApplySwitch bzApplySwitch) {
            super(bzApplySwitch);
            if (bzApplySwitch == null) {
                return;
            }
            this.apply_switch = bzApplySwitch.apply_switch;
            this.manager_link = bzApplySwitch.manager_link;
            this.assist_link = bzApplySwitch.assist_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BzApplySwitch build(boolean z) {
            return new BzApplySwitch(this, z);
        }
    }

    public BzApplySwitch(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.apply_switch;
            if (num == null) {
                this.apply_switch = DEFAULT_APPLY_SWITCH;
            } else {
                this.apply_switch = num;
            }
            String str = builder.manager_link;
            if (str == null) {
                this.manager_link = "";
            } else {
                this.manager_link = str;
            }
            String str2 = builder.assist_link;
            if (str2 == null) {
                this.assist_link = "";
                return;
            } else {
                this.assist_link = str2;
                return;
            }
        }
        this.apply_switch = builder.apply_switch;
        this.manager_link = builder.manager_link;
        this.assist_link = builder.assist_link;
    }
}
