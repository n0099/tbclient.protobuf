package tbclient.GetAlbumPhotoList;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class AlbumPhoList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ALBUM_ID = "";
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_PICTURE_ID = "";
    public static final String DEFAULT_SMALL_PIC = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String picture_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String small_pic;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<AlbumPhoList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String album_id;
        public String big_pic;
        public String picture_id;
        public String small_pic;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(AlbumPhoList albumPhoList) {
            super(albumPhoList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {albumPhoList};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (albumPhoList == null) {
                return;
            }
            this.picture_id = albumPhoList.picture_id;
            this.album_id = albumPhoList.album_id;
            this.small_pic = albumPhoList.small_pic;
            this.big_pic = albumPhoList.big_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumPhoList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlbumPhoList(this, z, null) : (AlbumPhoList) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ AlbumPhoList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumPhoList(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.picture_id;
            if (str == null) {
                this.picture_id = "";
            } else {
                this.picture_id = str;
            }
            String str2 = builder.album_id;
            if (str2 == null) {
                this.album_id = "";
            } else {
                this.album_id = str2;
            }
            String str3 = builder.small_pic;
            if (str3 == null) {
                this.small_pic = "";
            } else {
                this.small_pic = str3;
            }
            String str4 = builder.big_pic;
            if (str4 == null) {
                this.big_pic = "";
                return;
            } else {
                this.big_pic = str4;
                return;
            }
        }
        this.picture_id = builder.picture_id;
        this.album_id = builder.album_id;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
    }
}
