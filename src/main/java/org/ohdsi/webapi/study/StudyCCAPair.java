/**
 * This file was generated by the JPA Modeler
 */ 

package org.ohdsi.webapi.study;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Chris Knoll <cknoll@ohdsi.org>
 */

@Entity
@Table(name="STUDY_CCA_PAIR")
@IdClass(StudyCCAPairPK.class)
public class StudyCCAPair { 

    @Id@OneToOne(targetEntity = StudyCohort.class)
    @JoinColumn(name="TARGET_ID",referencedColumnName="ID")
    private StudyCohort target;

    @Id@OneToOne(targetEntity = StudyCohort.class)
    @JoinColumn(name="COMPARATOR_ID",referencedColumnName="ID")
    private StudyCohort comparator;

    @Id@OneToOne(targetEntity = StudyCohort.class)
    @JoinColumn(name="OUTCOME_ID",referencedColumnName="ID")
    private StudyCohort outcome;


    public StudyCohort getTarget() {
        return this.target;
    }

    public void setTarget(StudyCohort target) {
        this.target = target;
    }

    public StudyCohort getComparator() {
        return this.comparator;
    }

    public void setComparator(StudyCohort comparator) {
        this.comparator = comparator;
    }

    public StudyCohort getOutcome() {
        return this.outcome;
    }

    public void setOutcome(StudyCohort outcome) {
        this.outcome = outcome;
    }


}
