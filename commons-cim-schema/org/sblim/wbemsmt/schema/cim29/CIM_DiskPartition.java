/** 
 * CIM_DiskPartition.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    michael.bauschert@de.ibm.com 
 * 
 * Description: A DiskPartition is a presentation of a contiguous range of logical blocks that is identifiable by the Operating System via the Partition's type and subtype fields. Disk Partitions should be directly realized by PhysicalMedia (indicated by the RealizesDiskPartition association) or built on StorageVolumes (indicated by the PartitionBasedOnVolume association.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_DiskPartition extends CIM_MediaPartition {

    public final static String CIM_CLASS_NAME = "CIM_DiskPartition";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * DiskPartitions should be BasedOn a single StorageVolume (for example, exposed by a hardware RAID cabinet), an SCC VolumeSet, or realized directly in PhysicalMedia. The first two relationships are made explicit in this association. The latter is conveyed by the RealizesDiskPartition association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME = "CIM_DiskPartitionBasedOnVolume";

    /**
     * DiskPartitions can be directly realized on a PhysicalMedia. This is used to model the creation of Partitions on a raw SCSI or IDE drive, using the fdisk (DOS and Unix) or pdisk (Unix) command. The StartingAddress of the DiskPartition on the PhysicalMedia is also specified as a property of this relationship. An alternative is that Partitions can be BasedOn StorageVolumes, such as a VolumeSet or a Volume exposed by a hardware RAID cabinet. The latter relationship is modeled using the DiskPartitionBasedOnVolume association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION = "CIM_RealizesDiskPartition";

    /**
     * LogicalDisks can be BasedOn a DiskPartition. For example, a personal computer's C: drive may be located on a Partition on local PhysicalMedia. In this association of LogicalDisks to Partitions, note that the cardinality of the Antecedent, Disk Partition, is Max (1). This dictates that a LogicalDisk can not span more than one Partition. However, there are cases where this is true. When it occurs, the LogicalDisk is really based on some kind of RAID configuration (for example, a mirror or stripe set). In these scenarios, the LogicalDisk is more correctly BasedOn a StorageVolume. To prevent incorrectly using the LogicalDiskBasedOnPartition association, the Max (1) qualifier was put on the Antecedent reference to the DiskPartition.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION = "CIM_LogicalDiskBasedOnPartition";

    /**
     * Constants of property PartitionSubtype
     * The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
     */
    public static class PROPERTY_PARTITIONSUBTYPE {
        /**
         * name of the property PartitionSubtype
         */
        public final static String NAME = "PartitionSubtype";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Empty___Microsoft = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Empty | Microsoft (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Empty___Microsoft = "Empty | Microsoft";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_DOS_12_bit_FAT = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry DOS 12-bit FAT (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_DOS_12_bit_FAT = "DOS 12-bit FAT";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_XENIX_root = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry XENIX root (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_XENIX_root = "XENIX root";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_XENIX_usr = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry XENIX usr (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_XENIX_usr = "XENIX usr";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DOS_16_bit_FAT = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DOS 16-bit FAT (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DOS_16_bit_FAT = "DOS 16-bit FAT";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DOS_Extended = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry DOS Extended (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_DOS_Extended = "DOS Extended";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DOS_16_bit_FAT____32MB_ = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DOS 16-bit FAT (> 32MB) (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DOS_16_bit_FAT____32MB_ = "DOS 16-bit FAT (> 32MB)";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry OS/2 HPFS | Win NTFS | QNX Ver 2 | Adv UNIX (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX = "OS/2 HPFS | Win NTFS | QNX Ver 2 | Adv UNIX";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry AIX Boot | OS /2 | Dell (Array) | Commodore DOS (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS = "AIX Boot | OS /2 | Dell (Array) | Commodore DOS";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX_Data = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry AIX Data (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_AIX_Data = "AIX Data";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Coherent = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Coherent (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Coherent = "Coherent";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS_2_Boot_Manager = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry OS/2 Boot Manager (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_OS_2_Boot_Manager = "OS/2 Boot Manager";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_32_bit_FAT = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry 32-bit FAT (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_32_bit_FAT = "32-bit FAT";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_32_bit_FAT = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Microsoft_16_bit_FAT = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Microsoft 16-bit FAT (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Microsoft_16_bit_FAT = "Microsoft 16-bit FAT";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Microsoft_DOS_Extended = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Microsoft DOS Extended (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Microsoft_DOS_Extended = "Microsoft DOS Extended";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_OPUS___OS_2_2_0 = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry OPUS | OS/2 2.0 (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_OPUS___OS_2_2_0 = "OPUS | OS/2 2.0";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1 = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type 1 (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1 = "OS/2 (MOSS) Inactive Type 1";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Compaq Diagnostics Partition | Microsoft (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft = "Compaq Diagnostics Partition | Microsoft";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4 = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type 4 (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4 = "OS/2 (MOSS) Inactive Type 4";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6 = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type 6 (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6 = "OS/2 (MOSS) Inactive Type 6";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7 = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type 7 (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7 = "OS/2 (MOSS) Inactive Type 7";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type B (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B = "OS/2 (MOSS) Inactive Type B";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry OS/2 (MOSS) Inactive Type C (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C = "OS/2 (MOSS) Inactive Type C";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry Microsoft (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_Microsoft = "Microsoft";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_OS_2_Logical_Volume_Manager = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry OS/2 Logical Volume Manager (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_OS_2_Logical_Volume_Manager = "OS/2 Logical Volume Manager";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_2_JFS_Log = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry OS/2 JFS Log (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_OS_2_JFS_Log = "OS/2 JFS Log";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_PowerQuest = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry PowerQuest (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_PowerQuest = "PowerQuest";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_VENIX_80286___Series_1_Disk = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry VENIX 80286 | Series/1 Disk (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_VENIX_80286___Series_1_Disk = "VENIX 80286 | Series/1 Disk";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Personal_RISC_Boot = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry Personal RISC Boot (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_Personal_RISC_Boot = "Personal RISC Boot";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Veritas = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry Veritas (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_Veritas = "Veritas";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Veritas = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry OnTrack Disk Manager Read Only DOS (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS = "OnTrack Disk Manager Read Only DOS";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry OnTrack Disk Manager Read/Write DOS (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS = "OnTrack Disk Manager Read/Write DOS";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry CPM | Microport System V/386 | OnTrack Disk Mgr | Microsoft (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft = "CPM | Microport System V/386 | OnTrack Disk Mgr | Microsoft";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_OnTrack_Disk_Manager = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry OnTrack Disk Manager (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_OnTrack_Disk_Manager = "OnTrack Disk Manager";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry OnTrack Disk Manager Non-DOS (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS = "OnTrack Disk Manager Non-DOS";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry Micro House EZ-Drive Non-DOS (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS = "Micro House EZ-Drive Non-DOS";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry Golden Bow Vfeature | Microsoft (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft = "Golden Bow Vfeature | Microsoft";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry Storage Dimensions SpeedStor | Microsoft (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft = "Storage Dimensions SpeedStor | Microsoft";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry UNIX - AT&T System V/386 | SCO UNIX (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX = "UNIX - AT&T System V/386 | SCO UNIX";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Novell_NetWare___Speedstore = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Novell NetWare | Speedstore (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Novell_NetWare___Speedstore = "Novell NetWare | Speedstore";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Novell_NetWare = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry Novell NetWare (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_Novell_NetWare = "Novell NetWare";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Novell_NetWare = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Novell = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry Novell (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_Novell = "Novell";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Novell = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value map entry 113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Novell = new javax.cim.UnsignedInteger16(
                "113");

        /**
         * constant for value map entry 115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "115");

        /**
         * constant for value map entry 116
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "116");

        /**
         * constant for value map entry 117
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "117");

        /**
         * constant for value map entry 118
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_PC_IX_IBM = new javax.cim.UnsignedInteger16(
                "118");

        /**
         * constant for value entry PC/IX IBM (corresponds to mapEntry 118 )
         */
        public final static String VALUE_ENTRY_PC_IX_IBM = "PC/IX IBM";

        /**
         * constant for value map entry 119
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "119");

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_QNX_POSIX = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry QNX POSIX (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_QNX_POSIX = "QNX POSIX";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_ = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry QNX POSIX (Secondary) (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_QNX_POSIX__Secondary_ = "QNX POSIX (Secondary)";

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_ = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * constant for value map entry 129
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Minix____1_4a____Linux___Microsoft = new javax.cim.UnsignedInteger16(
                "129");

        /**
         * constant for value entry Minix (<=1.4a) | Linux | Microsoft (corresponds to mapEntry 129 )
         */
        public final static String VALUE_ENTRY_Minix____1_4a____Linux___Microsoft = "Minix (<=1.4a) | Linux | Microsoft";

        /**
         * constant for value map entry 130
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Minix____1_4b____Microsoft = new javax.cim.UnsignedInteger16(
                "130");

        /**
         * constant for value entry Minix (>=1.4b) | Microsoft (corresponds to mapEntry 130 )
         */
        public final static String VALUE_ENTRY_Minix____1_4b____Microsoft = "Minix (>=1.4b) | Microsoft";

        /**
         * constant for value map entry 131
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Linux_Swap___Prime = new javax.cim.UnsignedInteger16(
                "131");

        /**
         * constant for value entry Linux Swap | Prime (corresponds to mapEntry 131 )
         */
        public final static String VALUE_ENTRY_Linux_Swap___Prime = "Linux Swap | Prime";

        /**
         * constant for value map entry 132
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Linux_Native___Apple = new javax.cim.UnsignedInteger16(
                "132");

        /**
         * constant for value entry Linux Native | Apple (corresponds to mapEntry 132 )
         */
        public final static String VALUE_ENTRY_Linux_Native___Apple = "Linux Native | Apple";

        /**
         * constant for value map entry 134
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_System_Hibernation_for_APM = new javax.cim.UnsignedInteger16(
                "134");

        /**
         * constant for value entry System Hibernation for APM (corresponds to mapEntry 134 )
         */
        public final static String VALUE_ENTRY_System_Hibernation_for_APM = "System Hibernation for APM";

        /**
         * constant for value map entry 135
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "135");

        /**
         * constant for value map entry 147
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_HPFS_FT_mirror = new javax.cim.UnsignedInteger16(
                "147");

        /**
         * constant for value entry HPFS FT mirror (corresponds to mapEntry 147 )
         */
        public final static String VALUE_ENTRY_HPFS_FT_mirror = "HPFS FT mirror";

        /**
         * constant for value map entry 148
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_Amoeba___Microsoft = new javax.cim.UnsignedInteger16(
                "148");

        /**
         * constant for value entry Amoeba | Microsoft (corresponds to mapEntry 148 )
         */
        public final static String VALUE_ENTRY_Amoeba___Microsoft = "Amoeba | Microsoft";

        /**
         * constant for value map entry 161
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_Amoeba_BBT___Microsoft = new javax.cim.UnsignedInteger16(
                "161");

        /**
         * constant for value entry Amoeba BBT | Microsoft (corresponds to mapEntry 161 )
         */
        public final static String VALUE_ENTRY_Amoeba_BBT___Microsoft = "Amoeba BBT | Microsoft";

        /**
         * constant for value map entry 163
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "163");

        /**
         * constant for value map entry 164
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "164");

        /**
         * constant for value map entry 165
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "165");

        /**
         * constant for value map entry 166
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_BSD_386 = new javax.cim.UnsignedInteger16(
                "166");

        /**
         * constant for value entry BSD/386 (corresponds to mapEntry 166 )
         */
        public final static String VALUE_ENTRY_BSD_386 = "BSD/386";

        /**
         * constant for value map entry 177
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "177");

        /**
         * constant for value map entry 179
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "179");

        /**
         * constant for value map entry 180
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "180");

        /**
         * constant for value map entry 182
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "182");

        /**
         * constant for value map entry 183
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "183");

        /**
         * constant for value map entry 184
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_BSDI_fs___Microsoft = new javax.cim.UnsignedInteger16(
                "184");

        /**
         * constant for value entry BSDI fs | Microsoft (corresponds to mapEntry 184 )
         */
        public final static String VALUE_ENTRY_BSDI_fs___Microsoft = "BSDI fs | Microsoft";

        /**
         * constant for value map entry 193
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_BSDI_Swap___Microsoft = new javax.cim.UnsignedInteger16(
                "193");

        /**
         * constant for value entry BSDI Swap | Microsoft (corresponds to mapEntry 193 )
         */
        public final static String VALUE_ENTRY_BSDI_Swap___Microsoft = "BSDI Swap | Microsoft";

        /**
         * constant for value map entry 196
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "196");

        /**
         * constant for value map entry 198
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "198");

        /**
         * constant for value map entry 199
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "199");

        /**
         * constant for value map entry 216
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror = new javax.cim.UnsignedInteger16(
                "216");

        /**
         * constant for value entry Syrinx | HPFS FT Disabled Mirror (corresponds to mapEntry 216 )
         */
        public final static String VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror = "Syrinx | HPFS FT Disabled Mirror";

        /**
         * constant for value map entry 219
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_CP_M_86 = new javax.cim.UnsignedInteger16(
                "219");

        /**
         * constant for value entry CP/M 86 (corresponds to mapEntry 219 )
         */
        public final static String VALUE_ENTRY_CP_M_86 = "CP/M 86";

        /**
         * constant for value map entry 225
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_225_FOR_VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER = new javax.cim.UnsignedInteger16(
                "225");

        /**
         * constant for value entry Digital Research CPM-86 | Concurrent DOS | OUTRIGGER (corresponds to mapEntry 225 )
         */
        public final static String VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER = "Digital Research CPM-86 | Concurrent DOS | OUTRIGGER";

        /**
         * constant for value map entry 227
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_227_FOR_VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended = new javax.cim.UnsignedInteger16(
                "227");

        /**
         * constant for value entry SpeedStor 12-bit FAT Extended (corresponds to mapEntry 227 )
         */
        public final static String VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended = "SpeedStor 12-bit FAT Extended";

        /**
         * constant for value map entry 228
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_228_FOR_VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions = new javax.cim.UnsignedInteger16(
                "228");

        /**
         * constant for value entry DOS Read-Only | Storage Dimensions (corresponds to mapEntry 228 )
         */
        public final static String VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions = "DOS Read-Only | Storage Dimensions";

        /**
         * constant for value map entry 229
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_229_FOR_VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended = new javax.cim.UnsignedInteger16(
                "229");

        /**
         * constant for value entry SpeedStor 16-bit FAT Extended (corresponds to mapEntry 229 )
         */
        public final static String VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended = "SpeedStor 16-bit FAT Extended";

        /**
         * constant for value map entry 230
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_230_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "230");

        /**
         * constant for value map entry 239
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_239_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "239");

        /**
         * constant for value map entry 240
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_240_FOR_VALUE_ENTRY_Intel = new javax.cim.UnsignedInteger16(
                "240");

        /**
         * constant for value entry Intel (corresponds to mapEntry 240 )
         */
        public final static String VALUE_ENTRY_Intel = "Intel";

        /**
         * constant for value map entry 241
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_241_FOR_VALUE_ENTRY_OS_2_Raw_Data = new javax.cim.UnsignedInteger16(
                "241");

        /**
         * constant for value entry OS/2 Raw Data (corresponds to mapEntry 241 )
         */
        public final static String VALUE_ENTRY_OS_2_Raw_Data = "OS/2 Raw Data";

        /**
         * constant for value map entry 242
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_242_FOR_VALUE_ENTRY_Storage_Dimensions = new javax.cim.UnsignedInteger16(
                "242");

        /**
         * constant for value entry Storage Dimensions (corresponds to mapEntry 242 )
         */
        public final static String VALUE_ENTRY_Storage_Dimensions = "Storage Dimensions";

        /**
         * constant for value map entry 243
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_243_FOR_VALUE_ENTRY_DOS__Secondary_ = new javax.cim.UnsignedInteger16(
                "243");

        /**
         * constant for value entry DOS (Secondary) (corresponds to mapEntry 243 )
         */
        public final static String VALUE_ENTRY_DOS__Secondary_ = "DOS (Secondary)";

        /**
         * constant for value map entry 244
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_244_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "244");

        /**
         * constant for value map entry 246
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_246_FOR_VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions = new javax.cim.UnsignedInteger16(
                "246");

        /**
         * constant for value entry SpeedStor Large | Storage Dimensions (corresponds to mapEntry 246 )
         */
        public final static String VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions = "SpeedStor Large | Storage Dimensions";

        /**
         * constant for value map entry 254
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_254_FOR_VALUE_ENTRY_Microsoft = new javax.cim.UnsignedInteger16(
                "254");

        /**
         * constant for value map entry 255
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML = new javax.cim.UnsignedInteger16(
                "255");

        /**
         * constant for value entry Lan Step | SpeedStor | IBM PS/2 IML (corresponds to mapEntry 255 )
         */
        public final static String VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML = "Lan Step | SpeedStor | IBM PS/2 IML";

        /**
         * constant for value map entry 65535
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65535_FOR_VALUE_ENTRY_Bad_Block_Tables = new javax.cim.UnsignedInteger16(
                "65535");

        /**
         * constant for value entry Bad Block Tables (corresponds to mapEntry 65535 )
         */
        public final static String VALUE_ENTRY_Bad_Block_Tables = "Bad Block Tables";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@655a655a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Empty___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Empty___Microsoft;
            }

            if (VALUE_ENTRY_DOS_12_bit_FAT.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_DOS_12_bit_FAT;
            }

            if (VALUE_ENTRY_XENIX_root.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_XENIX_root;
            }

            if (VALUE_ENTRY_XENIX_usr.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_XENIX_usr;
            }

            if (VALUE_ENTRY_DOS_16_bit_FAT.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DOS_16_bit_FAT;
            }

            if (VALUE_ENTRY_DOS_Extended.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DOS_Extended;
            }

            if (VALUE_ENTRY_DOS_16_bit_FAT____32MB_.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DOS_16_bit_FAT____32MB_;
            }

            if (VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX;
            }

            if (VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS;
            }

            if (VALUE_ENTRY_AIX_Data.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX_Data;
            }

            if (VALUE_ENTRY_Coherent.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Coherent;
            }

            if (VALUE_ENTRY_OS_2_Boot_Manager.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS_2_Boot_Manager;
            }

            if (VALUE_ENTRY_32_bit_FAT.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_32_bit_FAT;
            }

            if (VALUE_ENTRY_32_bit_FAT.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_32_bit_FAT;
            }

            if (VALUE_ENTRY_Microsoft_16_bit_FAT.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Microsoft_16_bit_FAT;
            }

            if (VALUE_ENTRY_Microsoft_DOS_Extended.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Microsoft_DOS_Extended;
            }

            if (VALUE_ENTRY_OPUS___OS_2_2_0.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_OPUS___OS_2_2_0;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1;
            }

            if (VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B;
            }

            if (VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_OS_2_Logical_Volume_Manager.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_OS_2_Logical_Volume_Manager;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_OS_2_JFS_Log.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_2_JFS_Log;
            }

            if (VALUE_ENTRY_PowerQuest.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_PowerQuest;
            }

            if (VALUE_ENTRY_VENIX_80286___Series_1_Disk.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_VENIX_80286___Series_1_Disk;
            }

            if (VALUE_ENTRY_Personal_RISC_Boot.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Personal_RISC_Boot;
            }

            if (VALUE_ENTRY_Veritas.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Veritas;
            }

            if (VALUE_ENTRY_Veritas.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Veritas;
            }

            if (VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS;
            }

            if (VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS;
            }

            if (VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft
                    .equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft;
            }

            if (VALUE_ENTRY_OnTrack_Disk_Manager.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_OnTrack_Disk_Manager;
            }

            if (VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS;
            }

            if (VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS;
            }

            if (VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft;
            }

            if (VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft;
            }

            if (VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX;
            }

            if (VALUE_ENTRY_Novell_NetWare___Speedstore.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Novell_NetWare___Speedstore;
            }

            if (VALUE_ENTRY_Novell_NetWare.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Novell_NetWare;
            }

            if (VALUE_ENTRY_Novell_NetWare.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Novell_NetWare;
            }

            if (VALUE_ENTRY_Novell.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Novell;
            }

            if (VALUE_ENTRY_Novell.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Novell;
            }

            if (VALUE_ENTRY_Novell.equals(value)) {
                return VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Novell;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_PC_IX_IBM.equals(value)) {
                return VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_PC_IX_IBM;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_QNX_POSIX.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_QNX_POSIX;
            }

            if (VALUE_ENTRY_QNX_POSIX__Secondary_.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_;
            }

            if (VALUE_ENTRY_QNX_POSIX__Secondary_.equals(value)) {
                return VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_;
            }

            if (VALUE_ENTRY_Minix____1_4a____Linux___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Minix____1_4a____Linux___Microsoft;
            }

            if (VALUE_ENTRY_Minix____1_4b____Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Minix____1_4b____Microsoft;
            }

            if (VALUE_ENTRY_Linux_Swap___Prime.equals(value)) {
                return VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Linux_Swap___Prime;
            }

            if (VALUE_ENTRY_Linux_Native___Apple.equals(value)) {
                return VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Linux_Native___Apple;
            }

            if (VALUE_ENTRY_System_Hibernation_for_APM.equals(value)) {
                return VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_System_Hibernation_for_APM;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_HPFS_FT_mirror.equals(value)) {
                return VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_HPFS_FT_mirror;
            }

            if (VALUE_ENTRY_Amoeba___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_Amoeba___Microsoft;
            }

            if (VALUE_ENTRY_Amoeba_BBT___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_Amoeba_BBT___Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_BSD_386.equals(value)) {
                return VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_BSD_386;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_BSDI_fs___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_BSDI_fs___Microsoft;
            }

            if (VALUE_ENTRY_BSDI_Swap___Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_BSDI_Swap___Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror.equals(value)) {
                return VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror;
            }

            if (VALUE_ENTRY_CP_M_86.equals(value)) {
                return VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_CP_M_86;
            }

            if (VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER.equals(value)) {
                return VALUE_MAP_ENTRY_225_FOR_VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER;
            }

            if (VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended.equals(value)) {
                return VALUE_MAP_ENTRY_227_FOR_VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended;
            }

            if (VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions.equals(value)) {
                return VALUE_MAP_ENTRY_228_FOR_VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions;
            }

            if (VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended.equals(value)) {
                return VALUE_MAP_ENTRY_229_FOR_VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_230_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_239_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Intel.equals(value)) {
                return VALUE_MAP_ENTRY_240_FOR_VALUE_ENTRY_Intel;
            }

            if (VALUE_ENTRY_OS_2_Raw_Data.equals(value)) {
                return VALUE_MAP_ENTRY_241_FOR_VALUE_ENTRY_OS_2_Raw_Data;
            }

            if (VALUE_ENTRY_Storage_Dimensions.equals(value)) {
                return VALUE_MAP_ENTRY_242_FOR_VALUE_ENTRY_Storage_Dimensions;
            }

            if (VALUE_ENTRY_DOS__Secondary_.equals(value)) {
                return VALUE_MAP_ENTRY_243_FOR_VALUE_ENTRY_DOS__Secondary_;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_244_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions.equals(value)) {
                return VALUE_MAP_ENTRY_246_FOR_VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions;
            }

            if (VALUE_ENTRY_Microsoft.equals(value)) {
                return VALUE_MAP_ENTRY_254_FOR_VALUE_ENTRY_Microsoft;
            }

            if (VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML.equals(value)) {
                return VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML;
            }

            if (VALUE_ENTRY_Bad_Block_Tables.equals(value)) {
                return VALUE_MAP_ENTRY_65535_FOR_VALUE_ENTRY_Bad_Block_Tables;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Empty___Microsoft.intValue()) {
                return VALUE_ENTRY_Empty___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_DOS_12_bit_FAT.intValue()) {
                return VALUE_ENTRY_DOS_12_bit_FAT;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_XENIX_root.intValue()) {
                return VALUE_ENTRY_XENIX_root;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_XENIX_usr.intValue()) {
                return VALUE_ENTRY_XENIX_usr;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DOS_16_bit_FAT.intValue()) {
                return VALUE_ENTRY_DOS_16_bit_FAT;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DOS_Extended.intValue()) {
                return VALUE_ENTRY_DOS_Extended;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DOS_16_bit_FAT____32MB_.intValue()) {
                return VALUE_ENTRY_DOS_16_bit_FAT____32MB_;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX
                    .intValue()) {
                return VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS
                    .intValue()) {
                return VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX_Data.intValue()) {
                return VALUE_ENTRY_AIX_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Coherent.intValue()) {
                return VALUE_ENTRY_Coherent;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS_2_Boot_Manager.intValue()) {
                return VALUE_ENTRY_OS_2_Boot_Manager;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_32_bit_FAT.intValue()) {
                return VALUE_ENTRY_32_bit_FAT;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_32_bit_FAT.intValue()) {
                return VALUE_ENTRY_32_bit_FAT;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Microsoft_16_bit_FAT.intValue()) {
                return VALUE_ENTRY_Microsoft_16_bit_FAT;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Microsoft_DOS_Extended.intValue()) {
                return VALUE_ENTRY_Microsoft_DOS_Extended;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_OPUS___OS_2_2_0.intValue()) {
                return VALUE_ENTRY_OPUS___OS_2_2_0;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft
                    .intValue()) {
                return VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C.intValue()) {
                return VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_OS_2_Logical_Volume_Manager.intValue()) {
                return VALUE_ENTRY_OS_2_Logical_Volume_Manager;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_2_JFS_Log.intValue()) {
                return VALUE_ENTRY_OS_2_JFS_Log;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_PowerQuest.intValue()) {
                return VALUE_ENTRY_PowerQuest;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_VENIX_80286___Series_1_Disk.intValue()) {
                return VALUE_ENTRY_VENIX_80286___Series_1_Disk;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Personal_RISC_Boot.intValue()) {
                return VALUE_ENTRY_Personal_RISC_Boot;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Veritas.intValue()) {
                return VALUE_ENTRY_Veritas;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Veritas.intValue()) {
                return VALUE_ENTRY_Veritas;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS
                    .intValue()) {
                return VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS
                    .intValue()) {
                return VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft
                    .intValue()) {
                return VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_OnTrack_Disk_Manager.intValue()) {
                return VALUE_ENTRY_OnTrack_Disk_Manager;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS
                    .intValue()) {
                return VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS
                    .intValue()) {
                return VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft
                    .intValue()) {
                return VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft
                    .intValue()) {
                return VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX
                    .intValue()) {
                return VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Novell_NetWare___Speedstore
                    .intValue()) {
                return VALUE_ENTRY_Novell_NetWare___Speedstore;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Novell_NetWare.intValue()) {
                return VALUE_ENTRY_Novell_NetWare;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Novell_NetWare.intValue()) {
                return VALUE_ENTRY_Novell_NetWare;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Novell.intValue()) {
                return VALUE_ENTRY_Novell;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Novell.intValue()) {
                return VALUE_ENTRY_Novell;
            }

            if (iValue == VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Novell.intValue()) {
                return VALUE_ENTRY_Novell;
            }

            if (iValue == VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_PC_IX_IBM.intValue()) {
                return VALUE_ENTRY_PC_IX_IBM;
            }

            if (iValue == VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_QNX_POSIX.intValue()) {
                return VALUE_ENTRY_QNX_POSIX;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_.intValue()) {
                return VALUE_ENTRY_QNX_POSIX__Secondary_;
            }

            if (iValue == VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_.intValue()) {
                return VALUE_ENTRY_QNX_POSIX__Secondary_;
            }

            if (iValue == VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Minix____1_4a____Linux___Microsoft
                    .intValue()) {
                return VALUE_ENTRY_Minix____1_4a____Linux___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Minix____1_4b____Microsoft.intValue()) {
                return VALUE_ENTRY_Minix____1_4b____Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Linux_Swap___Prime.intValue()) {
                return VALUE_ENTRY_Linux_Swap___Prime;
            }

            if (iValue == VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Linux_Native___Apple.intValue()) {
                return VALUE_ENTRY_Linux_Native___Apple;
            }

            if (iValue == VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_System_Hibernation_for_APM.intValue()) {
                return VALUE_ENTRY_System_Hibernation_for_APM;
            }

            if (iValue == VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_HPFS_FT_mirror.intValue()) {
                return VALUE_ENTRY_HPFS_FT_mirror;
            }

            if (iValue == VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_Amoeba___Microsoft.intValue()) {
                return VALUE_ENTRY_Amoeba___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_Amoeba_BBT___Microsoft.intValue()) {
                return VALUE_ENTRY_Amoeba_BBT___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_BSD_386.intValue()) {
                return VALUE_ENTRY_BSD_386;
            }

            if (iValue == VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_BSDI_fs___Microsoft.intValue()) {
                return VALUE_ENTRY_BSDI_fs___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_BSDI_Swap___Microsoft.intValue()) {
                return VALUE_ENTRY_BSDI_Swap___Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror
                    .intValue()) {
                return VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror;
            }

            if (iValue == VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_CP_M_86.intValue()) {
                return VALUE_ENTRY_CP_M_86;
            }

            if (iValue == VALUE_MAP_ENTRY_225_FOR_VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER
                    .intValue()) {
                return VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER;
            }

            if (iValue == VALUE_MAP_ENTRY_227_FOR_VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended
                    .intValue()) {
                return VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended;
            }

            if (iValue == VALUE_MAP_ENTRY_228_FOR_VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions
                    .intValue()) {
                return VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions;
            }

            if (iValue == VALUE_MAP_ENTRY_229_FOR_VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended
                    .intValue()) {
                return VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended;
            }

            if (iValue == VALUE_MAP_ENTRY_230_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_239_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_240_FOR_VALUE_ENTRY_Intel.intValue()) {
                return VALUE_ENTRY_Intel;
            }

            if (iValue == VALUE_MAP_ENTRY_241_FOR_VALUE_ENTRY_OS_2_Raw_Data.intValue()) {
                return VALUE_ENTRY_OS_2_Raw_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_242_FOR_VALUE_ENTRY_Storage_Dimensions.intValue()) {
                return VALUE_ENTRY_Storage_Dimensions;
            }

            if (iValue == VALUE_MAP_ENTRY_243_FOR_VALUE_ENTRY_DOS__Secondary_.intValue()) {
                return VALUE_ENTRY_DOS__Secondary_;
            }

            if (iValue == VALUE_MAP_ENTRY_244_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_246_FOR_VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions
                    .intValue()) {
                return VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions;
            }

            if (iValue == VALUE_MAP_ENTRY_254_FOR_VALUE_ENTRY_Microsoft.intValue()) {
                return VALUE_ENTRY_Microsoft;
            }

            if (iValue == VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML
                    .intValue()) {
                return VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML;
            }

            if (iValue == VALUE_MAP_ENTRY_65535_FOR_VALUE_ENTRY_Bad_Block_Tables.intValue()) {
                return VALUE_ENTRY_Bad_Block_Tables;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property PartitionSubtype   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Empty___Microsoft,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_DOS_12_bit_FAT,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_XENIX_root,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_XENIX_usr,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DOS_16_bit_FAT,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DOS_Extended,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DOS_16_bit_FAT____32MB_,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX_Data,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Coherent,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS_2_Boot_Manager,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_32_bit_FAT,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_32_bit_FAT,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Microsoft_16_bit_FAT,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Microsoft_DOS_Extended,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_OPUS___OS_2_2_0,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_OS_2_Logical_Volume_Manager,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_2_JFS_Log,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_PowerQuest,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_VENIX_80286___Series_1_Disk,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Personal_RISC_Boot,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Veritas,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Veritas,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_OnTrack_Disk_Manager,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Novell_NetWare___Speedstore,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Novell_NetWare,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Novell_NetWare,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Novell,
                VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Novell,
                VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Novell,
                VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_PC_IX_IBM,
                VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_QNX_POSIX,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_,
                VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_QNX_POSIX__Secondary_,
                VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Minix____1_4a____Linux___Microsoft,
                VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Minix____1_4b____Microsoft,
                VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Linux_Swap___Prime,
                VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Linux_Native___Apple,
                VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_System_Hibernation_for_APM,
                VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_HPFS_FT_mirror,
                VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_Amoeba___Microsoft,
                VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_Amoeba_BBT___Microsoft,
                VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_BSD_386,
                VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_BSDI_fs___Microsoft,
                VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_BSDI_Swap___Microsoft,
                VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror,
                VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_CP_M_86,
                VALUE_MAP_ENTRY_225_FOR_VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER,
                VALUE_MAP_ENTRY_227_FOR_VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended,
                VALUE_MAP_ENTRY_228_FOR_VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions,
                VALUE_MAP_ENTRY_229_FOR_VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended,
                VALUE_MAP_ENTRY_230_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_239_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_240_FOR_VALUE_ENTRY_Intel,
                VALUE_MAP_ENTRY_241_FOR_VALUE_ENTRY_OS_2_Raw_Data,
                VALUE_MAP_ENTRY_242_FOR_VALUE_ENTRY_Storage_Dimensions,
                VALUE_MAP_ENTRY_243_FOR_VALUE_ENTRY_DOS__Secondary_,
                VALUE_MAP_ENTRY_244_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_246_FOR_VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions,
                VALUE_MAP_ENTRY_254_FOR_VALUE_ENTRY_Microsoft,
                VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML,
                VALUE_MAP_ENTRY_65535_FOR_VALUE_ENTRY_Bad_Block_Tables };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PartitionSubtype   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Empty___Microsoft,
                VALUE_ENTRY_DOS_12_bit_FAT, VALUE_ENTRY_XENIX_root, VALUE_ENTRY_XENIX_usr,
                VALUE_ENTRY_DOS_16_bit_FAT, VALUE_ENTRY_DOS_Extended,
                VALUE_ENTRY_DOS_16_bit_FAT____32MB_,
                VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX,
                VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS, VALUE_ENTRY_AIX_Data,
                VALUE_ENTRY_Coherent, VALUE_ENTRY_OS_2_Boot_Manager, VALUE_ENTRY_32_bit_FAT,
                VALUE_ENTRY_Microsoft_16_bit_FAT, VALUE_ENTRY_Microsoft_DOS_Extended,
                VALUE_ENTRY_OPUS___OS_2_2_0, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1,
                VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C, VALUE_ENTRY_Microsoft,
                VALUE_ENTRY_OS_2_Logical_Volume_Manager, VALUE_ENTRY_OS_2_JFS_Log,
                VALUE_ENTRY_PowerQuest, VALUE_ENTRY_VENIX_80286___Series_1_Disk,
                VALUE_ENTRY_Personal_RISC_Boot, VALUE_ENTRY_Veritas,
                VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS,
                VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS,
                VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft,
                VALUE_ENTRY_OnTrack_Disk_Manager, VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS,
                VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS,
                VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft,
                VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft,
                VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX,
                VALUE_ENTRY_Novell_NetWare___Speedstore, VALUE_ENTRY_Novell_NetWare,
                VALUE_ENTRY_Novell, VALUE_ENTRY_PC_IX_IBM, VALUE_ENTRY_QNX_POSIX,
                VALUE_ENTRY_QNX_POSIX__Secondary_, VALUE_ENTRY_Minix____1_4a____Linux___Microsoft,
                VALUE_ENTRY_Minix____1_4b____Microsoft, VALUE_ENTRY_Linux_Swap___Prime,
                VALUE_ENTRY_Linux_Native___Apple, VALUE_ENTRY_System_Hibernation_for_APM,
                VALUE_ENTRY_HPFS_FT_mirror, VALUE_ENTRY_Amoeba___Microsoft,
                VALUE_ENTRY_Amoeba_BBT___Microsoft, VALUE_ENTRY_BSD_386,
                VALUE_ENTRY_BSDI_fs___Microsoft, VALUE_ENTRY_BSDI_Swap___Microsoft,
                VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror, VALUE_ENTRY_CP_M_86,
                VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER,
                VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended,
                VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions,
                VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended, VALUE_ENTRY_Intel,
                VALUE_ENTRY_OS_2_Raw_Data, VALUE_ENTRY_Storage_Dimensions,
                VALUE_ENTRY_DOS__Secondary_, VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions,
                VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML, VALUE_ENTRY_Bad_Block_Tables };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PartitionSubtype   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Empty___Microsoft,
                VALUE_ENTRY_DOS_12_bit_FAT, VALUE_ENTRY_XENIX_root, VALUE_ENTRY_XENIX_usr,
                VALUE_ENTRY_DOS_16_bit_FAT, VALUE_ENTRY_DOS_Extended,
                VALUE_ENTRY_DOS_16_bit_FAT____32MB_,
                VALUE_ENTRY_OS_2_HPFS___Win_NTFS___QNX_Ver_2___Adv_UNIX,
                VALUE_ENTRY_AIX_Boot___OS__2___Dell__Array____Commodore_DOS, VALUE_ENTRY_AIX_Data,
                VALUE_ENTRY_Coherent, VALUE_ENTRY_OS_2_Boot_Manager, VALUE_ENTRY_32_bit_FAT,
                VALUE_ENTRY_Microsoft_16_bit_FAT, VALUE_ENTRY_Microsoft_DOS_Extended,
                VALUE_ENTRY_OPUS___OS_2_2_0, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_1,
                VALUE_ENTRY_Compaq_Diagnostics_Partition___Microsoft,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_4, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_6,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_7, VALUE_ENTRY_OS_2__MOSS__Inactive_Type_B,
                VALUE_ENTRY_OS_2__MOSS__Inactive_Type_C, VALUE_ENTRY_Microsoft,
                VALUE_ENTRY_OS_2_Logical_Volume_Manager, VALUE_ENTRY_OS_2_JFS_Log,
                VALUE_ENTRY_PowerQuest, VALUE_ENTRY_VENIX_80286___Series_1_Disk,
                VALUE_ENTRY_Personal_RISC_Boot, VALUE_ENTRY_Veritas,
                VALUE_ENTRY_OnTrack_Disk_Manager_Read_Only_DOS,
                VALUE_ENTRY_OnTrack_Disk_Manager_Read_Write_DOS,
                VALUE_ENTRY_CPM___Microport_System_V_386___OnTrack_Disk_Mgr___Microsoft,
                VALUE_ENTRY_OnTrack_Disk_Manager, VALUE_ENTRY_OnTrack_Disk_Manager_Non_DOS,
                VALUE_ENTRY_Micro_House_EZ_Drive_Non_DOS,
                VALUE_ENTRY_Golden_Bow_Vfeature___Microsoft,
                VALUE_ENTRY_Storage_Dimensions_SpeedStor___Microsoft,
                VALUE_ENTRY_UNIX___AT_T_System_V_386___SCO_UNIX,
                VALUE_ENTRY_Novell_NetWare___Speedstore, VALUE_ENTRY_Novell_NetWare,
                VALUE_ENTRY_Novell, VALUE_ENTRY_PC_IX_IBM, VALUE_ENTRY_QNX_POSIX,
                VALUE_ENTRY_QNX_POSIX__Secondary_, VALUE_ENTRY_Minix____1_4a____Linux___Microsoft,
                VALUE_ENTRY_Minix____1_4b____Microsoft, VALUE_ENTRY_Linux_Swap___Prime,
                VALUE_ENTRY_Linux_Native___Apple, VALUE_ENTRY_System_Hibernation_for_APM,
                VALUE_ENTRY_HPFS_FT_mirror, VALUE_ENTRY_Amoeba___Microsoft,
                VALUE_ENTRY_Amoeba_BBT___Microsoft, VALUE_ENTRY_BSD_386,
                VALUE_ENTRY_BSDI_fs___Microsoft, VALUE_ENTRY_BSDI_Swap___Microsoft,
                VALUE_ENTRY_Syrinx___HPFS_FT_Disabled_Mirror, VALUE_ENTRY_CP_M_86,
                VALUE_ENTRY_Digital_Research_CPM_86___Concurrent_DOS___OUTRIGGER,
                VALUE_ENTRY_SpeedStor_12_bit_FAT_Extended,
                VALUE_ENTRY_DOS_Read_Only___Storage_Dimensions,
                VALUE_ENTRY_SpeedStor_16_bit_FAT_Extended, VALUE_ENTRY_Intel,
                VALUE_ENTRY_OS_2_Raw_Data, VALUE_ENTRY_Storage_Dimensions,
                VALUE_ENTRY_DOS__Secondary_, VALUE_ENTRY_SpeedStor_Large___Storage_Dimensions,
                VALUE_ENTRY_Lan_Step___SpeedStor___IBM_PS_2_IML, VALUE_ENTRY_Bad_Block_Tables };

    }

    /**
     * Constants of property PartitionType
     * The type of Partition.
     */
    public static class PROPERTY_PARTITIONTYPE {
        /**
         * name of the property PartitionType
         */
        public final static String NAME = "PartitionType";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Primary = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Primary (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Primary = "Primary";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Extended = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Extended (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Extended = "Extended";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Logical = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Logical (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Logical = "Logical";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@48204820
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Primary.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Primary;
            }

            if (VALUE_ENTRY_Extended.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Extended;
            }

            if (VALUE_ENTRY_Logical.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Logical;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Primary.intValue()) {
                return VALUE_ENTRY_Primary;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Extended.intValue()) {
                return VALUE_ENTRY_Extended;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Logical.intValue()) {
                return VALUE_ENTRY_Logical;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property PartitionType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Primary,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Extended,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Logical };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PartitionType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Primary,
                VALUE_ENTRY_Extended, VALUE_ENTRY_Logical };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PartitionType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Primary, VALUE_ENTRY_Extended, VALUE_ENTRY_Logical };

    }

    /**
     * Constants of property PrimaryPartition
     * Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
     */
    public static class PROPERTY_PRIMARYPARTITION {
        /**
         * name of the property PrimaryPartition
         */
        public final static String NAME = "PrimaryPartition";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_MediaPartition.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A DiskPartition is a presentation of a contiguous range of logical blocks that is identifiable by the Operating System via the Partition's type and subtype fields. Disk Partitions should be directly realized by PhysicalMedia (indicated by the RealizesDiskPartition association) or built on StorageVolumes (indicated by the PartitionBasedOnVolume association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_DiskPartition(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A DiskPartition is a presentation of a contiguous range of logical blocks that is identifiable by the Operating System via the Partition's type and subtype fields. Disk Partitions should be directly realized by PhysicalMedia (indicated by the RealizesDiskPartition association) or built on StorageVolumes (indicated by the PartitionBasedOnVolume association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_DiskPartition(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_DiskPartition() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("PartitionSubtype", new CIMProperty("PartitionSubtype",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("PartitionType", new CIMProperty("PartitionType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("PrimaryPartition", new CIMProperty("PrimaryPartition",
                CIMDataType.BOOLEAN_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property PartitionSubtype
     *     * <br>
     * The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
     *     */

    public javax.cim.UnsignedInteger16 get_PartitionSubtype() {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTITIONSUBTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTITIONSUBTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PartitionSubtype
     * <br>
     * The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartitionSubtype(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTITIONSUBTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartitionSubtype(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTITIONSUBTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartitionSubtype by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartitionSubtype(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_DiskPartition fco = new CIM_DiskPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTITIONSUBTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PartitionSubtype(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTITIONSUBTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartitionSubtype
     * <br>
     * The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
     */

    private static CIMProperty setPropertyValue_PartitionSubtype(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartitionType
     *     * <br>
     * The type of Partition.
     *     */

    public javax.cim.UnsignedInteger16 get_PartitionType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTITIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTITIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PartitionType
     * <br>
     * The type of Partition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartitionType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTITIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartitionType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTITIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartitionType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartitionType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_DiskPartition fco = new CIM_DiskPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTITIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PartitionType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTITIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartitionType
     * <br>
     * The type of Partition.
     */

    private static CIMProperty setPropertyValue_PartitionType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PrimaryPartition
     *     * <br>
     * Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
     *     */

    public Boolean get_PrimaryPartition() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYPARTITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMARYPARTITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PrimaryPartition
     * <br>
     * Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrimaryPartition(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYPARTITION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PrimaryPartition(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYPARTITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrimaryPartition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryPartition(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_DiskPartition fco = new CIM_DiskPartition(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYPARTITION.NAME);
        if (property != null) {
            property = setPropertyValue_PrimaryPartition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYPARTITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrimaryPartition
     * <br>
     * Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
     */

    private static CIMProperty setPropertyValue_PrimaryPartition(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    /**
     * Get the list with CIM_StorageVolume objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                CIM_StorageVolume.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_StorageVolume objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_StorageVolume objects associated by the association CIM_DiskPartitionBasedOnVolume
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumes(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DiskPartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_StorageVolume(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_StorageVolume(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_StorageVolume(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumeNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                CIM_StorageVolume.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumeNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumeNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_DiskPartitionBasedOnVolume
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageVolume_CIM_DiskPartitionBasedOnVolumeNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                    CIM_StorageVolume.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_StorageVolume.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_DiskPartitionBasedOnVolume associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_DiskPartitionBasedOnVolume(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DiskPartitionBasedOnVolumeHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_DiskPartitionBasedOnVolume(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_DiskPartitionBasedOnVolume
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_DiskPartitionBasedOnVolume(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_DISKPARTITIONBASEDONVOLUME,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_DiskPartitionBasedOnVolume.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_RealizesDiskPartition
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION,
                CIM_PhysicalMedia.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_RealizesDiskPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMedia objects associated by the association CIM_RealizesDiskPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitions(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DiskPartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMedia(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMedia(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMedia(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesDiskPartition
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION,
                CIM_PhysicalMedia.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesDiskPartition
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesDiskPartition
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMedia_CIM_RealizesDiskPartitionNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION,
                    CIM_PhysicalMedia.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMedia.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_RealizesDiskPartition associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_RealizesDiskPartition(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_RealizesDiskPartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_RealizesDiskPartition(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_RealizesDiskPartition(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_RealizesDiskPartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_RealizesDiskPartition
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_RealizesDiskPartition(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESDISKPARTITION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_RealizesDiskPartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnPartition
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION,
                CIM_LogicalDisk.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_LogicalDisk objects associated by the association CIM_LogicalDiskBasedOnPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitions(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_DiskPartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDisk(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDisk(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDisk(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnPartition
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION,
                CIM_LogicalDisk.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnPartition
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_LogicalDiskBasedOnPartition
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_LogicalDisk_CIM_LogicalDiskBasedOnPartitionNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION,
                    CIM_LogicalDisk.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalDisk.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_LogicalDiskBasedOnPartition associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_LogicalDiskBasedOnPartition(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_LogicalDiskBasedOnPartitionHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDiskBasedOnPartition(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDiskBasedOnPartition(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_LogicalDiskBasedOnPartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_LogicalDiskBasedOnPartition
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_LogicalDiskBasedOnPartition(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_LOGICALDISKBASEDONPARTITION,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_DiskPartitionHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_DiskPartitionHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_LogicalDiskBasedOnPartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_DiskPartitionHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_DiskPartition.CIM_CLASS_NAME;
    }

}