package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ManagerElectionTab extends Message {
    public static final Integer DEFAULT_IS_NEW_STRATEGY = 0;
    public static final Integer DEFAULT_NEW_MANAGER_STATUS = 0;
    public static final String DEFAULT_NEW_STRATEGY_LINK = "";
    public static final String DEFAULT_NEW_STRATEGY_TEXT = "";
    public static final String DEFAULT_TOAST_TEXT = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_new_strategy;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer new_manager_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String new_strategy_link;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String new_strategy_text;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String toast_text;

    private ManagerElectionTab(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_new_strategy == null) {
                this.is_new_strategy = DEFAULT_IS_NEW_STRATEGY;
            } else {
                this.is_new_strategy = builder.is_new_strategy;
            }
            if (builder.new_strategy_link == null) {
                this.new_strategy_link = "";
            } else {
                this.new_strategy_link = builder.new_strategy_link;
            }
            if (builder.new_manager_status == null) {
                this.new_manager_status = DEFAULT_NEW_MANAGER_STATUS;
            } else {
                this.new_manager_status = builder.new_manager_status;
            }
            if (builder.new_strategy_text == null) {
                this.new_strategy_text = "";
            } else {
                this.new_strategy_text = builder.new_strategy_text;
            }
            if (builder.toast_text == null) {
                this.toast_text = "";
                return;
            } else {
                this.toast_text = builder.toast_text;
                return;
            }
        }
        this.is_new_strategy = builder.is_new_strategy;
        this.new_strategy_link = builder.new_strategy_link;
        this.new_manager_status = builder.new_manager_status;
        this.new_strategy_text = builder.new_strategy_text;
        this.toast_text = builder.toast_text;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ManagerElectionTab> {
        public Integer is_new_strategy;
        public Integer new_manager_status;
        public String new_strategy_link;
        public String new_strategy_text;
        public String toast_text;

        public Builder() {
        }

        public Builder(ManagerElectionTab managerElectionTab) {
            super(managerElectionTab);
            if (managerElectionTab != null) {
                this.is_new_strategy = managerElectionTab.is_new_strategy;
                this.new_strategy_link = managerElectionTab.new_strategy_link;
                this.new_manager_status = managerElectionTab.new_manager_status;
                this.new_strategy_text = managerElectionTab.new_strategy_text;
                this.toast_text = managerElectionTab.toast_text;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ManagerElectionTab build(boolean z) {
            return new ManagerElectionTab(this, z);
        }
    }
}
