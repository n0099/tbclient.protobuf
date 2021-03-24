package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SeniorLottery extends Message {
    public static final String DEFAULT_ACT_DESC = "";
    public static final String DEFAULT_MYAWARD = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String act_desc;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<LotteryRegular> act_regular;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AwardInfo> award_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<AwardUser> luck_users;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String myaward;
    @ProtoField(tag = 1)
    public final LotteryTheme theme;
    public static final List<AwardInfo> DEFAULT_AWARD_INFO = Collections.emptyList();
    public static final List<AwardUser> DEFAULT_LUCK_USERS = Collections.emptyList();
    public static final List<LotteryRegular> DEFAULT_ACT_REGULAR = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SeniorLottery> {
        public String act_desc;
        public List<LotteryRegular> act_regular;
        public List<AwardInfo> award_info;
        public List<AwardUser> luck_users;
        public String myaward;
        public LotteryTheme theme;

        public Builder() {
        }

        public Builder(SeniorLottery seniorLottery) {
            super(seniorLottery);
            if (seniorLottery == null) {
                return;
            }
            this.theme = seniorLottery.theme;
            this.award_info = Message.copyOf(seniorLottery.award_info);
            this.myaward = seniorLottery.myaward;
            this.luck_users = Message.copyOf(seniorLottery.luck_users);
            this.act_desc = seniorLottery.act_desc;
            this.act_regular = Message.copyOf(seniorLottery.act_regular);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SeniorLottery build(boolean z) {
            return new SeniorLottery(this, z);
        }
    }

    public SeniorLottery(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.theme = builder.theme;
            List<AwardInfo> list = builder.award_info;
            if (list == null) {
                this.award_info = DEFAULT_AWARD_INFO;
            } else {
                this.award_info = Message.immutableCopyOf(list);
            }
            String str = builder.myaward;
            if (str == null) {
                this.myaward = "";
            } else {
                this.myaward = str;
            }
            List<AwardUser> list2 = builder.luck_users;
            if (list2 == null) {
                this.luck_users = DEFAULT_LUCK_USERS;
            } else {
                this.luck_users = Message.immutableCopyOf(list2);
            }
            String str2 = builder.act_desc;
            if (str2 == null) {
                this.act_desc = "";
            } else {
                this.act_desc = str2;
            }
            List<LotteryRegular> list3 = builder.act_regular;
            if (list3 == null) {
                this.act_regular = DEFAULT_ACT_REGULAR;
                return;
            } else {
                this.act_regular = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.theme = builder.theme;
        this.award_info = Message.immutableCopyOf(builder.award_info);
        this.myaward = builder.myaward;
        this.luck_users = Message.immutableCopyOf(builder.luck_users);
        this.act_desc = builder.act_desc;
        this.act_regular = Message.immutableCopyOf(builder.act_regular);
    }
}
