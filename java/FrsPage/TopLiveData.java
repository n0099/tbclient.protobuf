package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.YyExt;
/* loaded from: classes2.dex */
public final class TopLiveData extends Message {
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_FLV = "";
    public static final String DEFAULT_HLS = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_LIVE_SIZE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String flv;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String hls;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer jump_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String live_size;
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<TopLiveDataPostList> post_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9)
    public final YyExt yy_ext;
    public static final Integer DEFAULT_JUMP_TYPE = 0;
    public static final List<TopLiveDataPostList> DEFAULT_POST_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TopLiveData> {
        public String cover;
        public String desc;
        public String flv;
        public String hls;
        public Integer jump_type;
        public String jump_url;
        public String live_size;
        public List<TopLiveDataPostList> post_list;
        public String title;
        public YyExt yy_ext;

        public Builder() {
        }

        public Builder(TopLiveData topLiveData) {
            super(topLiveData);
            if (topLiveData == null) {
                return;
            }
            this.title = topLiveData.title;
            this.cover = topLiveData.cover;
            this.desc = topLiveData.desc;
            this.live_size = topLiveData.live_size;
            this.jump_type = topLiveData.jump_type;
            this.jump_url = topLiveData.jump_url;
            this.flv = topLiveData.flv;
            this.hls = topLiveData.hls;
            this.yy_ext = topLiveData.yy_ext;
            this.post_list = Message.copyOf(topLiveData.post_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopLiveData build(boolean z) {
            return new TopLiveData(this, z);
        }
    }

    public TopLiveData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.cover;
            if (str2 == null) {
                this.cover = "";
            } else {
                this.cover = str2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            String str4 = builder.live_size;
            if (str4 == null) {
                this.live_size = "";
            } else {
                this.live_size = str4;
            }
            Integer num = builder.jump_type;
            if (num == null) {
                this.jump_type = DEFAULT_JUMP_TYPE;
            } else {
                this.jump_type = num;
            }
            String str5 = builder.jump_url;
            if (str5 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str5;
            }
            String str6 = builder.flv;
            if (str6 == null) {
                this.flv = "";
            } else {
                this.flv = str6;
            }
            String str7 = builder.hls;
            if (str7 == null) {
                this.hls = "";
            } else {
                this.hls = str7;
            }
            this.yy_ext = builder.yy_ext;
            List<TopLiveDataPostList> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
                return;
            } else {
                this.post_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.cover = builder.cover;
        this.desc = builder.desc;
        this.live_size = builder.live_size;
        this.jump_type = builder.jump_type;
        this.jump_url = builder.jump_url;
        this.flv = builder.flv;
        this.hls = builder.hls;
        this.yy_ext = builder.yy_ext;
        this.post_list = Message.immutableCopyOf(builder.post_list);
    }
}
