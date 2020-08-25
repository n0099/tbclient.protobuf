package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class HotUserRankEntry extends Message {
    public static final String DEFAULT_MODULE_ICON = "";
    public static final String DEFAULT_MODULE_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ShortUserInfo> hot_user;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public final Boolean is_in_rank;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String module_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer today_rank;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer yesterday_rank;
    public static final List<ShortUserInfo> DEFAULT_HOT_USER = Collections.emptyList();
    public static final Integer DEFAULT_TODAY_RANK = 0;
    public static final Integer DEFAULT_YESTERDAY_RANK = 0;
    public static final Boolean DEFAULT_IS_IN_RANK = false;

    private HotUserRankEntry(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_user == null) {
                this.hot_user = DEFAULT_HOT_USER;
            } else {
                this.hot_user = immutableCopyOf(builder.hot_user);
            }
            if (builder.module_name == null) {
                this.module_name = "";
            } else {
                this.module_name = builder.module_name;
            }
            if (builder.module_icon == null) {
                this.module_icon = "";
            } else {
                this.module_icon = builder.module_icon;
            }
            if (builder.today_rank == null) {
                this.today_rank = DEFAULT_TODAY_RANK;
            } else {
                this.today_rank = builder.today_rank;
            }
            if (builder.yesterday_rank == null) {
                this.yesterday_rank = DEFAULT_YESTERDAY_RANK;
            } else {
                this.yesterday_rank = builder.yesterday_rank;
            }
            if (builder.is_in_rank == null) {
                this.is_in_rank = DEFAULT_IS_IN_RANK;
                return;
            } else {
                this.is_in_rank = builder.is_in_rank;
                return;
            }
        }
        this.hot_user = immutableCopyOf(builder.hot_user);
        this.module_name = builder.module_name;
        this.module_icon = builder.module_icon;
        this.today_rank = builder.today_rank;
        this.yesterday_rank = builder.yesterday_rank;
        this.is_in_rank = builder.is_in_rank;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<HotUserRankEntry> {
        public List<ShortUserInfo> hot_user;
        public Boolean is_in_rank;
        public String module_icon;
        public String module_name;
        public Integer today_rank;
        public Integer yesterday_rank;

        public Builder() {
        }

        public Builder(HotUserRankEntry hotUserRankEntry) {
            super(hotUserRankEntry);
            if (hotUserRankEntry != null) {
                this.hot_user = HotUserRankEntry.copyOf(hotUserRankEntry.hot_user);
                this.module_name = hotUserRankEntry.module_name;
                this.module_icon = hotUserRankEntry.module_icon;
                this.today_rank = hotUserRankEntry.today_rank;
                this.yesterday_rank = hotUserRankEntry.yesterday_rank;
                this.is_in_rank = hotUserRankEntry.is_in_rank;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotUserRankEntry build(boolean z) {
            return new HotUserRankEntry(this, z);
        }
    }
}
