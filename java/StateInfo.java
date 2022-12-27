package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class StateInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer icon_pid;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long icon_pid_new;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer icon_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    public static final Integer DEFAULT_ICON_TYPE = 0;
    public static final Integer DEFAULT_ICON_PID = 0;
    public static final Long DEFAULT_ICON_PID_NEW = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StateInfo> {
        public String icon;
        public Integer icon_pid;
        public Long icon_pid_new;
        public Integer icon_type;
        public String text;

        public Builder() {
        }

        public Builder(StateInfo stateInfo) {
            super(stateInfo);
            if (stateInfo == null) {
                return;
            }
            this.icon = stateInfo.icon;
            this.text = stateInfo.text;
            this.icon_type = stateInfo.icon_type;
            this.icon_pid = stateInfo.icon_pid;
            this.icon_pid_new = stateInfo.icon_pid_new;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StateInfo build(boolean z) {
            return new StateInfo(this, z);
        }
    }

    public StateInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
            } else {
                this.text = str2;
            }
            Integer num = builder.icon_type;
            if (num == null) {
                this.icon_type = DEFAULT_ICON_TYPE;
            } else {
                this.icon_type = num;
            }
            Integer num2 = builder.icon_pid;
            if (num2 == null) {
                this.icon_pid = DEFAULT_ICON_PID;
            } else {
                this.icon_pid = num2;
            }
            Long l = builder.icon_pid_new;
            if (l == null) {
                this.icon_pid_new = DEFAULT_ICON_PID_NEW;
                return;
            } else {
                this.icon_pid_new = l;
                return;
            }
        }
        this.icon = builder.icon;
        this.text = builder.text;
        this.icon_type = builder.icon_type;
        this.icon_pid = builder.icon_pid;
        this.icon_pid_new = builder.icon_pid_new;
    }
}
