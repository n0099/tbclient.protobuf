package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;
/* loaded from: classes2.dex */
public final class FestivalInfo extends Message {
    public static final String DEFAULT_BLESS = "";
    public static final String DEFAULT_COMMENT_TIPS = "";
    public static final Long DEFAULT_MAIN_FID = 0L;
    public static final String DEFAULT_MAIN_FNAME = "";
    public static final String DEFAULT_WRITE_SELECT_TIPS = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bless;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String comment_tips;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long main_fid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String main_fname;
    @ProtoField(tag = 6)
    public final ThemeColorInfo tips_color;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String write_select_tips;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FestivalInfo> {
        public String bless;
        public String comment_tips;
        public Long main_fid;
        public String main_fname;
        public ThemeColorInfo tips_color;
        public String write_select_tips;

        public Builder() {
        }

        public Builder(FestivalInfo festivalInfo) {
            super(festivalInfo);
            if (festivalInfo == null) {
                return;
            }
            this.main_fname = festivalInfo.main_fname;
            this.main_fid = festivalInfo.main_fid;
            this.bless = festivalInfo.bless;
            this.write_select_tips = festivalInfo.write_select_tips;
            this.comment_tips = festivalInfo.comment_tips;
            this.tips_color = festivalInfo.tips_color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FestivalInfo build(boolean z) {
            return new FestivalInfo(this, z);
        }
    }

    public FestivalInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.main_fname;
            if (str == null) {
                this.main_fname = "";
            } else {
                this.main_fname = str;
            }
            Long l = builder.main_fid;
            if (l == null) {
                this.main_fid = DEFAULT_MAIN_FID;
            } else {
                this.main_fid = l;
            }
            String str2 = builder.bless;
            if (str2 == null) {
                this.bless = "";
            } else {
                this.bless = str2;
            }
            String str3 = builder.write_select_tips;
            if (str3 == null) {
                this.write_select_tips = "";
            } else {
                this.write_select_tips = str3;
            }
            String str4 = builder.comment_tips;
            if (str4 == null) {
                this.comment_tips = "";
            } else {
                this.comment_tips = str4;
            }
            this.tips_color = builder.tips_color;
            return;
        }
        this.main_fname = builder.main_fname;
        this.main_fid = builder.main_fid;
        this.bless = builder.bless;
        this.write_select_tips = builder.write_select_tips;
        this.comment_tips = builder.comment_tips;
        this.tips_color = builder.tips_color;
    }
}
