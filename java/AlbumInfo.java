package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class AlbumInfo extends Message {
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 15, type = Message.Datatype.BOOL)
    public final Boolean has_collect;
    @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
    public final Double latd;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double longtd;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer num_high;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_ALBUM_ID = 0L;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Integer DEFAULT_NUM_JOIN = 0;
    public static final Integer DEFAULT_NUM_HIGH = 0;
    public static final Double DEFAULT_LONGTD = Double.valueOf(0.0d);
    public static final Double DEFAULT_LATD = Double.valueOf(0.0d);
    public static final Boolean DEFAULT_HAS_COLLECT = false;

    private AlbumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.album_id == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = builder.album_id;
            }
            if (builder.album_name == null) {
                this.album_name = "";
            } else {
                this.album_name = builder.album_name;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.num_join == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = builder.num_join;
            }
            if (builder.num_high == null) {
                this.num_high = DEFAULT_NUM_HIGH;
            } else {
                this.num_high = builder.num_high;
            }
            if (builder.location == null) {
                this.location = "";
            } else {
                this.location = builder.location;
            }
            if (builder.longtd == null) {
                this.longtd = DEFAULT_LONGTD;
            } else {
                this.longtd = builder.longtd;
            }
            if (builder.latd == null) {
                this.latd = DEFAULT_LATD;
            } else {
                this.latd = builder.latd;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.has_collect == null) {
                this.has_collect = DEFAULT_HAS_COLLECT;
                return;
            } else {
                this.has_collect = builder.has_collect;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.album_name = builder.album_name;
        this.uid = builder.uid;
        this.create_time = builder.create_time;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.update_time = builder.update_time;
        this.num_join = builder.num_join;
        this.num_high = builder.num_high;
        this.location = builder.location;
        this.longtd = builder.longtd;
        this.latd = builder.latd;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.has_collect = builder.has_collect;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AlbumInfo> {
        public Long album_id;
        public String album_name;
        public Integer create_time;
        public Integer end_time;
        public Boolean has_collect;
        public Double latd;
        public String location;
        public Double longtd;
        public Integer num_high;
        public Integer num_join;
        public String portrait;
        public Integer start_time;
        public Long uid;
        public Integer update_time;
        public String user_name;

        public Builder() {
        }

        public Builder(AlbumInfo albumInfo) {
            super(albumInfo);
            if (albumInfo != null) {
                this.album_id = albumInfo.album_id;
                this.album_name = albumInfo.album_name;
                this.uid = albumInfo.uid;
                this.create_time = albumInfo.create_time;
                this.start_time = albumInfo.start_time;
                this.end_time = albumInfo.end_time;
                this.update_time = albumInfo.update_time;
                this.num_join = albumInfo.num_join;
                this.num_high = albumInfo.num_high;
                this.location = albumInfo.location;
                this.longtd = albumInfo.longtd;
                this.latd = albumInfo.latd;
                this.user_name = albumInfo.user_name;
                this.portrait = albumInfo.portrait;
                this.has_collect = albumInfo.has_collect;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumInfo build(boolean z) {
            return new AlbumInfo(this, z);
        }
    }
}
