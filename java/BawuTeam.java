package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BawuTeam extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BawuRoleDes> bawu_team_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer total_num;
    public static final Integer DEFAULT_TOTAL_NUM = 0;
    public static final List<BawuRoleDes> DEFAULT_BAWU_TEAM_LIST = Collections.emptyList();

    /* synthetic */ BawuTeam(Builder builder, boolean z, BawuTeam bawuTeam) {
        this(builder, z);
    }

    private BawuTeam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.total_num == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = builder.total_num;
            }
            if (builder.bawu_team_list == null) {
                this.bawu_team_list = DEFAULT_BAWU_TEAM_LIST;
                return;
            } else {
                this.bawu_team_list = immutableCopyOf(builder.bawu_team_list);
                return;
            }
        }
        this.total_num = builder.total_num;
        this.bawu_team_list = immutableCopyOf(builder.bawu_team_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<BawuTeam> {
        public List<BawuRoleDes> bawu_team_list;
        public Integer total_num;

        public Builder() {
        }

        public Builder(BawuTeam bawuTeam) {
            super(bawuTeam);
            if (bawuTeam != null) {
                this.total_num = bawuTeam.total_num;
                this.bawu_team_list = BawuTeam.copyOf(bawuTeam.bawu_team_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BawuTeam build(boolean z) {
            return new BawuTeam(this, z, null);
        }
    }
}
